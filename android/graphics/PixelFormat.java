/*    */ package android.graphics;
/*    */ 
/*    */ public class PixelFormat
/*    */ {
/*    */   @Deprecated
/*    */   public static final int A_8 = 8;
/*    */   @Deprecated
/*    */   public static final int JPEG = 256;
/*    */   @Deprecated
/*    */   public static final int LA_88 = 10;
/*    */   @Deprecated
/*    */   public static final int L_8 = 9;
/*    */   public static final int OPAQUE = -1;
/*    */   public static final int RGBA_1010102 = 43;
/*    */   @Deprecated
/*    */   public static final int RGBA_4444 = 7;
/*    */   @Deprecated
/*    */   public static final int RGBA_5551 = 6;
/*    */   public static final int RGBA_8888 = 1;
/*    */   public static final int RGBA_F16 = 22;
/*    */   public static final int RGBX_8888 = 2;
/*    */   
/*    */   public PixelFormat() {
/* 24 */     throw new RuntimeException("Stub!");
/*    */   } @Deprecated
/*    */   public static final int RGB_332 = 11; public static final int RGB_565 = 4; public static final int RGB_888 = 3; public static final int TRANSLUCENT = -3; public static final int TRANSPARENT = -2; public static final int UNKNOWN = 0; @Deprecated
/*    */   public static final int YCbCr_420_SP = 17; @Deprecated
/*    */   public static final int YCbCr_422_I = 20; @Deprecated
/*    */   public static final int YCbCr_422_SP = 16; public int bitsPerPixel; public int bytesPerPixel; public static void getPixelFormatInfo(int format, PixelFormat info) {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean formatHasAlpha(int format) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\PixelFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */