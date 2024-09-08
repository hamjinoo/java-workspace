package excercise01;

public class example02 {
    public static void main(String[] args) {

        Movie movie01 = new Movie();
        movie01.title = "인셉션";
        movie01.review = "인생은 무한 루프";

        Movie movie02 = new Movie();
        movie02.title = "어바웃 타임";
        movie02.review = "인생 시간 영화!";

        Movie[] movies = new Movie[] {movie01, movie02};

        for(Movie movie : movies) {
            System.out.println("영화 제목 : " + movie.title + "영화 리뷰 : " + movie.review);
        }

    }
}
