
package Classes;
import Interfaces.iReturnOrder;

public class ActionClient extends Actor implements iReturnOrder {
    // Поле название акции 
    private String actionName;
    // Поле аукционный id клиента
    private int actionClientID = 1;
     // Поле количество клиентов в акции
    private static int actionClientCount = 7;

    /**
     * @param name  имя клиента
     * @param actionName название акции
     * @param clientID  количество клиентов в акции
     * @see ActionClient#ActionClient()
     */
    public ActionClient(String name, String actionName, int clientID) {
        super(name);
        this.actionName = actionName;
        this.actionClientID = clientID;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public int getActionClientID() {
        return actionClientID;
    }

    public void setActionClientID(int actionClientID) {
        this.actionClientID = actionClientID;
    }

    public static int getActionClientCount() {
        return actionClientCount;
    }

    public static void setActionClientCount(int actionClientCount) {
        ActionClient.actionClientCount = actionClientCount;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;

    }

    @Override
    public void setTakeOrder(boolean take) {
        super.isTakeOrder = take;
    }

    @Override
    public boolean goodsСheck() {
      return false;
    }

    @Override
    public boolean returnGoods() {
      return false;
    }

    
}