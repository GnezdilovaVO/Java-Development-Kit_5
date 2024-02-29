public class Fork {
    private int idFork;

    private volatile boolean freeFork;

    public Fork(int idFork) {
        freeFork = true;
        this.idFork = idFork;
    }
    public int getIdFork() {
        return idFork;
    }
    public boolean isFreeFork(){
        return freeFork;
    }
    public void setFreeFork(boolean freeBusy){
        this.freeFork = freeBusy;
    }


}
