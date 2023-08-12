package exercise.dto;

import exercise.model.Article;
import exercise.model.Category;
import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class ArticleDto {
    private String name;
    private String body;
    private Category category;

    public ArticleDto() {}

    public ArticleDto(Article article) {
        this.name = article.getName();
        this.body = article.getBody();
        this.category = article.getCategory();
    }
}
// END
