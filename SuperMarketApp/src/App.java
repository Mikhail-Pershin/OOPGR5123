import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;


public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new ActionClient("Nikita","1+1",10);
        iActorBehaviour client5 = new ActionClient("Alina","Regular customer",3);

       


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        

        magnit.update();
    }
}


