package exercise.dto;

import exercise.model.Category;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class ArticleDto {
    private long id;
    private String name;
    @Lob
    private Column body;
    @ManyToOne
    private Category category;
}
// END
