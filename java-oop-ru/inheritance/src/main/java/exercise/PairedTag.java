package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private final String text;
    private final List<Tag> children;

    public PairedTag(String name, Map data, String text, List<Tag> children) {
        super(name, data);
        this.text = text;
        this.children = children;
    }

    @Override
    public String toString() {
        if (children.isEmpty()) {
            return String.format("%s%s</%s>", super.toString(), text, super.name);
        } else {
            String listToString = listToString();
            return String.format("%s%s%s</%s>", super.toString(), text, listToString, super.name);
        }
    }

    private String listToString() {
        StringBuilder builder = new StringBuilder();
        for (Tag tag : children){
            builder.append(tag.toString());
        }
        return builder.toString();
    }
}
// END
