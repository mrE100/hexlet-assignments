package exercise.controller;

import exercise.dto.ArticleDto;
import exercise.model.Article;
import exercise.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;


@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticlesController {

    private final ArticleRepository articleRepository;

    @GetMapping(path = "")
    public Iterable<Article> getArticles() {
        return articleRepository.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public void deleteArticle(@PathVariable long id) {
        articleRepository.deleteById(id);
    }

    // BEGIN
    @PostMapping("")
    public String createArticle(@RequestBody ArticleDto articleDto) {
        Article article = new Article(articleDto);

        articleRepository.save(article);
        return "Ok";
    }

    @PatchMapping("/{id}")
    public String updateArticle(@RequestBody ArticleDto articleDto, @PathVariable("id") Long id) {
        Article article = new Article(articleDto);
        article.setId(id);

        articleRepository.save(article);
        return "Ok";
    }

    @GetMapping("/{id}")
    public ArticleDto getArticle(@PathVariable("id") Long id) {
        Article article = articleRepository.findById(id).orElseThrow();

        ArticleDto articleDto = new ArticleDto(article);
        return articleDto;
    }
    // END
}
