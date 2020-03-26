/*    */ package android.location;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
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
/*    */ public abstract class SettingInjectorService
/*    */   extends Service
/*    */ {
/*    */   public static final String ACTION_INJECTED_SETTING_CHANGED = "android.location.InjectedSettingChanged";
/*    */   public static final String ACTION_SERVICE_INTENT = "android.location.SettingInjectorService";
/*    */   public static final String ATTRIBUTES_NAME = "injected-location-setting";
/*    */   public static final String META_DATA_NAME = "android.location.SettingInjectorService";
/*    */   
/*    */   public SettingInjectorService(String name) {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   } public final IBinder onBind(Intent intent) {
/* 89 */     throw new RuntimeException("Stub!");
/*    */   } public final void onStart(Intent intent, int startId) {
/* 91 */     throw new RuntimeException("Stub!");
/*    */   } public final int onStartCommand(Intent intent, int flags, int startId) {
/* 93 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   protected abstract String onGetSummary();
/*    */   
/*    */   protected abstract boolean onGetEnabled();
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\location\SettingInjectorService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */