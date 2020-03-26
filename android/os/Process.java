/*     */ package android.os;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Process
/*     */ {
/*     */   public static final int FIRST_APPLICATION_UID = 10000;
/*     */   public static final int LAST_APPLICATION_UID = 19999;
/*     */   public static final int PHONE_UID = 1001;
/*     */   public static final int SIGNAL_KILL = 9;
/*     */   public static final int SIGNAL_QUIT = 3;
/*     */   public static final int SIGNAL_USR1 = 10;
/*     */   public static final int SYSTEM_UID = 1000;
/*     */   public static final int THREAD_PRIORITY_AUDIO = -16;
/*     */   public static final int THREAD_PRIORITY_BACKGROUND = 10;
/*     */   public static final int THREAD_PRIORITY_DEFAULT = 0;
/*     */   public static final int THREAD_PRIORITY_DISPLAY = -4;
/*     */   public static final int THREAD_PRIORITY_FOREGROUND = -2;
/*     */   public static final int THREAD_PRIORITY_LESS_FAVORABLE = 1;
/*     */   public static final int THREAD_PRIORITY_LOWEST = 19;
/*     */   public static final int THREAD_PRIORITY_MORE_FAVORABLE = -1;
/*     */   public static final int THREAD_PRIORITY_URGENT_AUDIO = -19;
/*     */   public static final int THREAD_PRIORITY_URGENT_DISPLAY = -8;
/*     */   public static final int THREAD_PRIORITY_VIDEO = -10;
/*     */   
/*     */   public Process() {
/*  28 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final native long getElapsedCpuTime();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long getStartElapsedRealtime() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long getStartUptimeMillis() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean is64Bit() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int myPid() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int myTid() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int myUid() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static UserHandle myUserHandle() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isApplicationUid(int uid) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean isIsolated() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public static final native int getUidForName(String paramString);
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
/*     */   public static final native int getGidForName(String paramString);
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
/*     */   public static final native void setThreadPriority(int paramInt1, int paramInt2) throws IllegalArgumentException, SecurityException;
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
/*     */   public static final native int[] getExclusiveCores();
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
/*     */   public static final native void setThreadPriority(int paramInt) throws IllegalArgumentException, SecurityException;
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
/*     */   public static final native int getThreadPriority(int paramInt) throws IllegalArgumentException;
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
/*     */   @Deprecated
/*     */   public static final boolean supportsProcesses() {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public static final void killProcess(int pid) {
/* 217 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static final native void sendSignal(int paramInt1, int paramInt2);
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\os\Process.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */