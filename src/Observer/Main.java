package Observer;

public class Main {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVac("Designer");
        jobSite.addVac("Designer_junior");

        Observer subscriber1 = new Subscriber("Alikhan");
        Observer subscriber2 = new Subscriber("Alikhan2");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVac("JOB");


        jobSite.removeVac("Designer");
    }
}
