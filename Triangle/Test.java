package Triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testClassify1() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 2;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.Classify(edge1,edge2,edge3);
        assertEquals(expected,result);
    }
    @Test
    void testClassify2() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 =3;
        String expected = "Tam giac can";
        String result = TriangleClassifier.Classify(edge1,edge2,edge3);
        assertEquals(expected,result);
    }
    @Test
    void testClassify3() {
        int edge1 = -1;
        int edge2 = 3;
        int edge3 = 2;
        String expected = "Khong la tam giac";
        String result = TriangleClassifier.Classify(edge1, edge2 ,edge3);
        assertEquals(expected,result);
    }
    @Test
    void testClassify4() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        String expected = "la tam giac";
        String result = TriangleClassifier.Classify(edge1, edge2, edge3);
        assertEquals(expected,result);
    }

}