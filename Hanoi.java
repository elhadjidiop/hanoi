package cfranc.hanoi;

public class Hanoi {
	
	Tour tourInit;
	Tour tourInter;
	Tour tourDest;
        private int nbDisque;

        
        // Jeu de hanoi avec n disques
	public Hanoi(int n){
            // TODO ...
            nbDisque = n;
            tourInit = new Tour(n);
            Disque tmp;
            for (int i=0; i<nbDisque;i++){
                tmp = new Disque(nbDisque-i);
                tourInit.empiler(tmp);
            }
            tourInter = new Tour(n);
            tourDest = new Tour (n);
	}

	// Jeu de hanoi avec 3 disques
	public Hanoi(){
            nbDisque = 3;
            tourInit = new Tour();
            Disque tmp;
            for( int i=0;i<nbDisque;i++){
                tmp = new Disque(nbDisque-i);
                tourInit.empiler(tmp);
            }
            tourInter = new Tour();
            tourDest = new Tour();
            Disque petit = new Disque(1);
            Disque moyen = new Disque(2);
            Disque grand = new Disque(3);
            tourInit.empiler(grand);
            tourInit.empiler(moyen);
            tourInit.empiler(petit);
	}
	
	public void bougerSommet(Tour from, Tour to) {
		tourInit = new Tour();
		tourInter = new Tour();
		tourDest = new Tour();
		// TODO ...
                to.empiler(from.depiler());
	}

	public void deplacer(int nbDisque, Tour from, Tour to, Tour by){
		if (nbDisque > 0) {
			deplacer(nbDisque-1, from, to, by);
			bougerSommet(from, to);
			deplacer(nbDisque-1, by, to, from);
		}
	}

	public void jouer() {
		deplacer(tourInit.taille(), tourInit, tourDest, tourInter);
	}

	public static void main(String[] args) {
		// Compléter la classe Hanoi pour résoudre le jeux avec 3 disques :
		Hanoi game = new Hanoi();
		System.out.println(game.tourInit.estVide());
		System.out.println(game.tourDest.estVide());
		game.jouer();
		System.out.println(game.tourInit.estVide());
                System.out.println(game.tourDest.estPleine());
                game.jouer();
		
		// Compléter la classe Hanoi pour résoudre le jeux avec n disques :
		int n =100;
		Hanoi gameN = new Hanoi(n);
		System.out.println(gameN.tourInit.estVide());
		System.out.println(gameN.tourDest.estVide());
		gameN.jouer();
		System.out.println(gameN.tourInit.estVide());
		System.out.println(gameN.tourDest.estVide());
		
	}

}