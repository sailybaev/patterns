package AbstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
