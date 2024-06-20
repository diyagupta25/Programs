interface myCamera {
    void takeSnap();
    void recordVideo();
}
interface myWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
    void takeSnap(){
        System.out.println("Taking Snap!!");
    }
}

class mySmartPhone extends myCellPhone implements myWifi, myCamera{
    public void takeSnap(){
        System.out.println("Taking Snap!!");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Diya", "Siya", "Yashmeet"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
    }

    public void connectToNetworks(String network){
        System.out.println("Connecting to "+network);
    }
}
public class Default_methods {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
