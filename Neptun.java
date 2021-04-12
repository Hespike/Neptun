public class Neptun extends TanulmanyiRendszer {

    public String elindit(int felhasznalok) {
        return felhasznalok <= 135211 ? "Neptun elinditva!" : "service is unavailable";
    }
}
