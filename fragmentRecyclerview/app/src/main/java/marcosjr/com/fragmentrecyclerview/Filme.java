package marcosjr.com.fragmentrecyclerview;

public class Filme {

    private String nome;
    private String descricao;
    private int image;

    public Filme() {
    }

    public Filme(String nome, String descricao, int image) {
        this.nome = nome;
        this.descricao = descricao;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
