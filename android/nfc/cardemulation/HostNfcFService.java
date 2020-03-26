/*     */ package android.nfc.cardemulation;
/*     */ 
/*     */ import android.app.Service;
/*     */ import android.content.Intent;
/*     */ import android.os.Bundle;
/*     */ import android.os.IBinder;
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
/*     */ public abstract class HostNfcFService
/*     */   extends Service
/*     */ {
/*     */   public static final int DEACTIVATION_LINK_LOSS = 0;
/*     */   public static final String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_NFCF_SERVICE";
/*     */   public static final String SERVICE_META_DATA = "android.nfc.cardemulation.host_nfcf_service";
/*     */   
/*     */   public HostNfcFService() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public final IBinder onBind(Intent intent) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void sendResponsePacket(byte[] responsePacket) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public abstract byte[] processNfcFPacket(byte[] paramArrayOfbyte, Bundle paramBundle);
/*     */   
/*     */   public abstract void onDeactivated(int paramInt);
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\nfc\cardemulation\HostNfcFService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */