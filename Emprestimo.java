class Emprestimo{
    private String data;
    private ArrayList <ItemEmprestimo> livros = new ArrayList<>();

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public void addLivro()
    {
        ItemEmprestimo item = new ItemEmprestimo();
        item.setDataDevolucao("15/07/2024")
        livros.add(item);
    }

}