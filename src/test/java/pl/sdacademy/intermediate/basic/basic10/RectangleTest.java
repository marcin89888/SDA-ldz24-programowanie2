package pl.sdacademy.intermediate.basic.basic10;

import org.junit.*;

public class RectangleTest {

    Rectangle rectangle;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting rectangle test");
    }

    @AfterClass
    public static void setDownClass() {
        System.out.println("Ending rectangle test");
    }

    @Before
    public void setRectangle() {
        this.rectangle = new Rectangle(3, 4);
    }

    @After
    public void tearDown() {
        System.out.println("After single test case.");
        System.out.flush();
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(12, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test
    public void testExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(-1, 4);
    }

    @Test
    public void testGetHigh() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test
    public void testGetWidth() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test
    public void testWuidthNotUpdate() {
        rectangle.updateWidth(0);
        Assert.assertEquals(9, rectangle.getWidth());
    }

}
