public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice () {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight () {
        if (this.weight < 700) {
            System.out.println("This notebook is light");
            if (this.weight < 1300) {
                System.out.println("This notebook is not very heavy");
            } else {
                System.out.println("This notebook is very heavy");
            }
        }
    }

    public void checkYearAndPrice() {
        if (this.year < 2015 && this.price < 500) {
            System.out.println("This is an old and cheap notebook");
        } else if ((this.year > 2015 && this.year < 2020) && (this.price > 600 && this.price < 1000)) {
            System.out.println("This is a modern notebook at a good price");
        } else {
            System.out.println("This is a modern and expensive notebook");
        }
    }
}



