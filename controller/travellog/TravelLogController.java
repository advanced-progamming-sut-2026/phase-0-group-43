package controller.travellog;

import model.menu.TravelLogPage;

public class TravelLogController {

    private TravelLogPage currentPage;

    public TravelLogController() {
        currentPage = TravelLogPage.CHAPTERS;
    }

    public void openTravelLog() {
    }

    public void setCurrentPage(TravelLogPage page) {
        this.currentPage = page;
    }

    public TravelLogPage getCurrentPage() {
        return currentPage;
    }

    public void goToMiniGamesPage() {
        currentPage = TravelLogPage.MINIGAMES;
    }
}