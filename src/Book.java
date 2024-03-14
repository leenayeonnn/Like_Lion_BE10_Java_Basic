public class Book {
    /*
        필드 = 객체의 속성
        속성을 도출해 내는 것 = 추상화
        사람마다 속성을 다르게 도출해 낼 수 있기에 추상화라 부름
        필드는 private로 가지는게 좋음
    */
    private String title;
    private int price;

    /*
        setter getter : 관용적 표현
        필드값을 가져오고 설정하기 위한 메서드
        프레임 워크에서 돌아가기 위해서 표현을 정해둠
    */
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    /*
        this : 자기자신
        변수명이 같은때 어떤 것인지 명확하게 해주기 위해서 사용

        왜 같게 만들까?
        타인이 인식하기 쉽게 만들기 위해서
        약어 지양
    */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
