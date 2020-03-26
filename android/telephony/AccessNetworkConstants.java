/*     */ package android.telephony;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AccessNetworkConstants
/*     */ {
/*     */   AccessNetworkConstants() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final class AccessNetworkType { public static final int CDMA2000 = 4; public static final int EUTRAN = 3;
/*     */     public static final int GERAN = 1;
/*     */     
/*     */     AccessNetworkType() {
/*  36 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public static final int IWLAN = 5; public static final int UNKNOWN = 0; public static final int UTRAN = 2; }
/*     */   public static final class EutranBand { public static final int BAND_1 = 1; public static final int BAND_10 = 10; public static final int BAND_11 = 11; public static final int BAND_12 = 12; public static final int BAND_13 = 13;
/*     */     public static final int BAND_14 = 14;
/*     */     public static final int BAND_17 = 17;
/*     */     public static final int BAND_18 = 18;
/*     */     public static final int BAND_19 = 19;
/*     */     public static final int BAND_2 = 2;
/*     */     public static final int BAND_20 = 20;
/*     */     public static final int BAND_21 = 21;
/*     */     public static final int BAND_22 = 22;
/*     */     public static final int BAND_23 = 23;
/*     */     public static final int BAND_24 = 24;
/*     */     public static final int BAND_25 = 25;
/*     */     public static final int BAND_26 = 26;
/*     */     public static final int BAND_27 = 27;
/*     */     public static final int BAND_28 = 28;
/*     */     public static final int BAND_3 = 3;
/*     */     public static final int BAND_30 = 30;
/*     */     public static final int BAND_31 = 31;
/*     */     public static final int BAND_33 = 33;
/*     */     public static final int BAND_34 = 34;
/*     */     
/*     */     EutranBand() {
/*  61 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int BAND_35 = 35;
/*     */ 
/*     */     
/*     */     public static final int BAND_36 = 36;
/*     */ 
/*     */     
/*     */     public static final int BAND_37 = 37;
/*     */ 
/*     */     
/*     */     public static final int BAND_38 = 38;
/*     */ 
/*     */     
/*     */     public static final int BAND_39 = 39;
/*     */ 
/*     */     
/*     */     public static final int BAND_4 = 4;
/*     */ 
/*     */     
/*     */     public static final int BAND_40 = 40;
/*     */ 
/*     */     
/*     */     public static final int BAND_41 = 41;
/*     */ 
/*     */     
/*     */     public static final int BAND_42 = 42;
/*     */ 
/*     */     
/*     */     public static final int BAND_43 = 43;
/*     */ 
/*     */     
/*     */     public static final int BAND_44 = 44;
/*     */ 
/*     */     
/*     */     public static final int BAND_45 = 45;
/*     */ 
/*     */     
/*     */     public static final int BAND_46 = 46;
/*     */ 
/*     */     
/*     */     public static final int BAND_47 = 47;
/*     */ 
/*     */     
/*     */     public static final int BAND_48 = 48;
/*     */ 
/*     */     
/*     */     public static final int BAND_5 = 5;
/*     */ 
/*     */     
/*     */     public static final int BAND_6 = 6;
/*     */ 
/*     */     
/*     */     public static final int BAND_65 = 65;
/*     */ 
/*     */     
/*     */     public static final int BAND_66 = 66;
/*     */ 
/*     */     
/*     */     public static final int BAND_68 = 68;
/*     */ 
/*     */     
/*     */     public static final int BAND_7 = 7;
/*     */ 
/*     */     
/*     */     public static final int BAND_70 = 70;
/*     */ 
/*     */     
/*     */     public static final int BAND_8 = 8;
/*     */     
/*     */     public static final int BAND_9 = 9; }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class GeranBand
/*     */   {
/*     */     public static final int BAND_450 = 3;
/*     */     
/*     */     public static final int BAND_480 = 4;
/*     */     
/*     */     public static final int BAND_710 = 5;
/*     */     
/*     */     public static final int BAND_750 = 6;
/*     */     
/*     */     public static final int BAND_850 = 8;
/*     */     
/*     */     public static final int BAND_DCS1800 = 12;
/*     */     
/*     */     public static final int BAND_E900 = 10;
/*     */     
/*     */     public static final int BAND_ER900 = 14;
/*     */     
/*     */     public static final int BAND_P900 = 9;
/*     */     
/*     */     public static final int BAND_PCS1900 = 13;
/*     */     
/*     */     public static final int BAND_R900 = 11;
/*     */     
/*     */     public static final int BAND_T380 = 1;
/*     */     
/*     */     public static final int BAND_T410 = 2;
/*     */     
/*     */     public static final int BAND_T810 = 7;
/*     */ 
/*     */     
/*     */     GeranBand() {
/* 170 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static final class UtranBand
/*     */   {
/*     */     public static final int BAND_1 = 1;
/*     */     
/*     */     public static final int BAND_10 = 10;
/*     */     
/*     */     public static final int BAND_11 = 11;
/*     */     
/*     */     public static final int BAND_12 = 12;
/*     */     
/*     */     public static final int BAND_13 = 13;
/*     */     
/*     */     public static final int BAND_14 = 14;
/*     */     
/*     */     public static final int BAND_19 = 19;
/*     */     
/*     */     public static final int BAND_2 = 2;
/*     */     
/*     */     public static final int BAND_20 = 20;
/*     */     
/*     */     public static final int BAND_21 = 21;
/*     */     
/*     */     public static final int BAND_22 = 22;
/*     */     
/*     */     public static final int BAND_25 = 25;
/*     */     
/*     */     public static final int BAND_26 = 26;
/*     */     public static final int BAND_3 = 3;
/*     */     public static final int BAND_4 = 4;
/*     */     public static final int BAND_5 = 5;
/*     */     public static final int BAND_6 = 6;
/*     */     public static final int BAND_7 = 7;
/*     */     public static final int BAND_8 = 8;
/*     */     public static final int BAND_9 = 9;
/*     */     
/*     */     UtranBand() {
/* 211 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\AccessNetworkConstants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */