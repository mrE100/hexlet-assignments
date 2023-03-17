package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final CharSequence text;


    public ReversedSequence(CharSequence newText) {
        StringBuilder toPut = new StringBuilder();
        for (int i = newText.length() - 1; i >= 0; i--) {
            toPut.append(newText.charAt(i));
        }
        this.text = toPut;
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end);
    }

    @Override
    public String toString() {
        return new StringBuilder(text).toString();
    }
}
// END
