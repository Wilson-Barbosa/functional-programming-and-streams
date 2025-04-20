public class App {
    public static void main(String[] args) throws Exception {
        
        Thread loading = new Loading();
        Thread background = new Background();

        loading.start();
        background.start();

        System.out.println(loading.threadId());
        System.out.println(background.threadId());
    }
}
