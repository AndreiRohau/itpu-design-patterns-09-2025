package ioc.type.lookup;

public class Main {
    public static void main(String[] args) {
        Service service = LookupService.getService();

        Controller controller = LookupService.getController();
        controller.initDependencies();

        controller.doIt();
        System.out.println("Easy to test");
    }
}
