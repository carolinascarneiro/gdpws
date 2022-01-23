/* 
1.2.32 Color conversion. 
Several different formats are used to 
represent color. For example, the primary
format for LCD displays, digital cameras,
and web pages, known as the RGB format,
specifies the level of red (R), green 
(G), and blue (B) on an integer scale 
from 0 to 255. The primary format for 
publishing books and magazines, known 
as the CMYKformat, specifies the level 
of cyan (C), magenta (M), yellow (Y), a
nd black (K) on a real scale from 0.0 
to 1.0.Write a program RG- BtoCMYK that 
converts RGB to CMYK. Take three integers
—r, g, and b—
from the command line and print the 
equivalent CMYK values. If the RGB 
values are all 0, then the CMY values 
are all 0 and the K value is 1; 
otherwise, use these formulas:
w = max(r/255,g/255,b/255)
c = (w-(r/255))/w m = (w-(g/255)) Iw y = (w-(fo/255)) Iw
k=1—w
*/

public class ColorConversion {
    public static void main(String[] args) {
        
        double r = Double.parseDouble(args[0]);
        double g = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);

        double w = Math.max(r/255, g/255);
        w = Math.max(w, b/255);
        double c = (w - (r/255))/w;
        double m = (w - (g/255))/w;
        double y = (w - (b/255))/w;
        double k = 1 - w;
        
        System.out.println(c);
        System.out.println(m);
        System.out.println(y);
        System.out.println(k);
    }
}
