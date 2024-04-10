public class main {
    public static void main(String[] args) {
        Dev eu = new Dev("Vinicius", 17);
        Dev eu2 = new Dev("Manoela", 14);
        Conteudo liveJava = new Mentoria("Live Java", "Live para aprender java");
        Conteudo livecsharp = new Mentoria("Live c#", "Live para aprender c#");

        System.out.println(liveJava);

        eu.matricular(liveJava);
        eu.matricular(liveJava);

        System.out.println(liveJava);
        System.out.println(eu.getConteudos());

        eu.matricular(livecsharp);
        eu2.matricular(livecsharp);

        System.out.println(eu.getConteudos());

        Conteudo livecsharp2 = new Mentoria("Live c#", "Live para aprender c#");
        eu.matricular(livecsharp2);

        System.out.println(eu.getConteudos());

    }
}
