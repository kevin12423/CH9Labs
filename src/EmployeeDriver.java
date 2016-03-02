/**
 * Created by kevin_000 on 2/17/2016.
 */
public class EmployeeDriver
{
    public static void main(String[] args)
    {

        ProductionWorker e1 = new ProductionWorker("Bob",2,3,6,"G",15,2,15.50);
        e1.getInfo(1,15.50);

        Supervisor s1 = new Supervisor("Kevin",2,5,7,"H",22,45000,10000);
        s1.supervisorInfo();

        TeamLeader leader1 = new TeamLeader("Eric",4,6,7,"A",14,1,20,500,15,10);
        leader1.getLeaderInfo(1,30);



    }
}
