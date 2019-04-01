package Assignment06;

public class News implements INews{
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content ;
    float AverageRate;
    int[]RateList = new int[3];


    public News(){

    }

    public News(int ID, String Title, String PublishDate, String Author,
                String Content, float AverageRate){
        this.ID = ID;
        this.Title =Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
        this.AverageRate = AverageRate;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display(){
        System.out.println("Title: " + Title);
        System.out.println("PublishDate: "+PublishDate);
        System.out.println("Author: "+Author);
        System.out.println("Content: "+Content);
        System.out.println("AverageRate: "+AverageRate);
    }
    public void Calculate (){
        AverageRate = (float) ((RateList [0] + RateList[1] + RateList[2]) /3.);
    }
}
