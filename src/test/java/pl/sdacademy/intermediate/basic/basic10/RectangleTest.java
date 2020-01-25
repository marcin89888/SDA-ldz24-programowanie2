package pl.sdacademy.intermediate.basic.basic10;

import org.junit.*;

public class RectangleTest {

    private static final int DEFAULT_WIDTH = 3;
    private static final int DEFAULT_HIGH = 4;
    private static final int DEFAULT_AREA = 12;
    private static final int DEFAULT_PERIMETER = 14;

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
        this.rectangle = new Rectangle(DEFAULT_WIDTH, DEFAULT_HIGH);
    }

    @After
    public void tearDown() {
        System.out.println("After single test case.");
        System.out.flush();
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(DEFAULT_AREA, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(DEFAULT_PERIMETER, rectangle.calculatePerimeter());
    }

    @Test
    public void testExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(-1, DEFAULT_HIGH);
    }

    @Test
    public void testGetHigh() {
        Assert.assertEquals(DEFAULT_HIGH, rectangle.calculatePerimeter());
    }

    @Test
    public void testGetWidth() {
        Assert.assertEquals(DEFAULT_WIDTH, rectangle.calculatePerimeter());
    }

    @Test
    public void testWidthNotUpdate() {
        rectangle.updateWidth(0);
        Assert.assertEquals(9, rectangle.getWidth());
    }

}
