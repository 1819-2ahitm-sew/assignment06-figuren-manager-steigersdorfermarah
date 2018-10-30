abstract class Figure {


    public static void main(String[] args) {


        Figure[] figure = new Figure[5];
        figure[0] = new Dreieck();
        figure[1] = new Rechteck();
        figure[2] = new Quadrat();
        figure[3] = new Ellipse();
        figure[4] = new Kreis();


        System.out.println("Datenanzeige:");
        System.out.println("-------------");

        for (int i = 0; i < figure.length; i++) {
            System.out.println(figure[i].output());
        }

    }
        abstract double area ();
        abstract double circumference ();
        abstract String output ();


}


class Dreieck extends Figure {
    int seite1 = 3;
    int seite2 = 3;
    int winkel = 45;


    @Override
    public double area() {
        return (seite1 * seite2) / 2;
    }


    @Override
    public double circumference() {
        return (seite1 + seite2 + seite2);
    }


    @Override
    public String output() {
        return "Dreieck mit der ersten Seite " + seite1 + " und der zweiten Seite "
                + seite2 + ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }
}


class Rechteck extends Figure {
    int laenge = 5;
    int breite = 4;


    @Override
    public double area() {
        return (laenge * breite);
    }

    @Override
    public double circumference() {
        return (2 * laenge + 2 * breite);
    }

    @Override
    public String output() {
        return "Rechteck mit der Laenge " + laenge + " und Breite "
                + breite + ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }
}


class Quadrat extends Figure {
    int seite = 3;

    @Override
    public double area() {
        return (seite * seite);
    }

    @Override
    public double circumference() {
        return (4 * seite);
    }

    @Override
    public String output() {
        return "Quadrat mit der Seite " + seite +
                ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }
}


class Ellipse extends Figure {
    int hauptachse = 10;
    int nebenachse = 6;


    @Override
    public double area() {
        return (hauptachse * nebenachse * Math.PI);
    }

    @Override
    public double circumference() {
        return (Math.PI * Math.sqrt(2 * (Math.pow(hauptachse, 2) + Math.pow(nebenachse, 2))));
    }


    @Override
    public String output() {

        return "Ellipse mit der Hauptachse " + hauptachse + " und der Nebenachse " + nebenachse +
                ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }
}


class Kreis extends Figure {
    int radius = 5;

    @Override

    public double area() {
        return (Math.PI * (radius * radius));
    }

    @Override
    public double circumference() {
        return (2 * radius * Math.PI);
    }

    @Override
    public String output() {
        return "Kreis mit dem Radius " + radius +
                ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }
}















