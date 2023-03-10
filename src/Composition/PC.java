package Composition;

public class PC {

    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        pcCase.pressPowerButton();
        drawBiosLogo();
    }

    private void drawBiosLogo() {
        monitor.drawLogoAt(1250, 1100);
    }

    public Case getPcCase() {
        return pcCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
