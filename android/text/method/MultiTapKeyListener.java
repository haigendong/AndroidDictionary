/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.SpanWatcher;
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
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
/*    */ public class MultiTapKeyListener
/*    */   extends BaseKeyListener
/*    */   implements SpanWatcher
/*    */ {
/*    */   public MultiTapKeyListener(TextKeyListener.Capitalize cap, boolean autotext) {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static MultiTapKeyListener getInstance(boolean autotext, TextKeyListener.Capitalize cap) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } public int getInputType() {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   } public void onSpanChanged(Spannable buf, Object what, int s, int e, int start, int stop) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   } public void onSpanAdded(Spannable s, Object what, int start, int end) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   } public void onSpanRemoved(Spannable s, Object what, int start, int end) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\method\MultiTapKeyListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */