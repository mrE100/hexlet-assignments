package exercise.model;

import exercise.dto.ArticleDto;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;

// BEGIN
@Getter
@Setter
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @Lob
    private String body;
    @ManyToOne
    private Category category;
    public Article() {}
    public Article(ArticleDto articleDto) {
        this.name = articleDto.getName();
        this.body = articleDto.getBody();
        this.category = articleDto.getCategory();
    }
}
// END
