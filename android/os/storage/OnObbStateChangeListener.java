/*    */ package android.os.storage;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class OnObbStateChangeListener
/*    */ {
/*    */   public static final int ERROR_ALREADY_MOUNTED = 24;
/*    */   public static final int ERROR_COULD_NOT_MOUNT = 21;
/*    */   public static final int ERROR_COULD_NOT_UNMOUNT = 22;
/*    */   public static final int ERROR_INTERNAL = 20;
/*    */   public static final int ERROR_NOT_MOUNTED = 23;
/*    */   public static final int ERROR_PERMISSION_DENIED = 25;
/*    */   public static final int MOUNTED = 1;
/*    */   public static final int UNMOUNTED = 2;
/*    */   
/*    */   public OnObbStateChangeListener() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onObbStateChange(String path, int state) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\storage\OnObbStateChangeListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */