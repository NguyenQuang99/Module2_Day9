package Triangle;

public class TriangleClassifier {
    public static String Classify( int edge1, int edge2, int edge3) {
        if( edge1 <= 0 || edge2 <= 0 || edge3 <=0) {
            return "Khong la tam giac";
        } else if(edge1 == edge2 && edge1 == edge3) {
            return "Tam giac deu";
        } else if(edge1 == edge2 || edge1 == edge3 || edge2 == edge3) {
            return "Tam giac can";
        } else {
            return "La tam giac";
        }
    }

}