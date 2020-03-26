/*      */ package android.media;
/*      */ 
/*      */ import android.util.Range;
/*      */ import androidx.annotation.RecentlyNullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class MediaCodecInfo
/*      */ {
/*      */   MediaCodecInfo(String name, boolean isEncoder, CodecCapabilities[] caps) {
/*   51 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getName() {
/*   57 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isEncoder() {
/*   63 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String[] getSupportedTypes() {
/*   69 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CodecCapabilities getCapabilitiesForType(String type) {
/*   78 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class AudioCapabilities
/*      */   {
/*      */     AudioCapabilities() {
/*   86 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getBitrateRange() {
/*   92 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int[] getSupportedSampleRates() {
/*  100 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer>[] getSupportedSampleRateRanges() {
/*  108 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getMaxInputChannelCount() {
/*  115 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isSampleRateSupported(int sampleRate)
/*      */     {
/*  121 */       throw new RuntimeException("Stub!");
/*      */     } }
/*      */   public static final class CodecCapabilities { @Deprecated
/*      */     public static final int COLOR_Format12bitRGB444 = 3; @Deprecated
/*      */     public static final int COLOR_Format16bitARGB1555 = 5; @Deprecated
/*      */     public static final int COLOR_Format16bitARGB4444 = 4; @Deprecated
/*      */     public static final int COLOR_Format16bitBGR565 = 7; public static final int COLOR_Format16bitRGB565 = 6; @Deprecated
/*      */     public static final int COLOR_Format18BitBGR666 = 41; @Deprecated
/*      */     public static final int COLOR_Format18bitARGB1665 = 9; @Deprecated
/*      */     public static final int COLOR_Format18bitRGB666 = 8; @Deprecated
/*      */     public static final int COLOR_Format19bitARGB1666 = 10; @Deprecated
/*      */     public static final int COLOR_Format24BitABGR6666 = 43; @Deprecated
/*      */     public static final int COLOR_Format24BitARGB6666 = 42; @Deprecated
/*      */     public static final int COLOR_Format24bitARGB1887 = 13; public static final int COLOR_Format24bitBGR888 = 12; @Deprecated
/*      */     public static final int COLOR_Format24bitRGB888 = 11;
/*  136 */     public CodecCapabilities() { throw new RuntimeException("Stub!"); }
/*      */     @Deprecated
/*      */     public static final int COLOR_Format25bitARGB1888 = 14; public static final int COLOR_Format32bitABGR8888 = 2130747392; @Deprecated
/*      */     public static final int COLOR_Format32bitARGB8888 = 16; @Deprecated
/*      */     public static final int COLOR_Format32bitBGRA8888 = 15; @Deprecated
/*      */     public static final int COLOR_Format8bitRGB332 = 2; @Deprecated
/*      */     public static final int COLOR_FormatCbYCrY = 27; @Deprecated
/*      */     public static final int COLOR_FormatCrYCbY = 28; public static final int COLOR_FormatL16 = 36; @Deprecated
/*      */     public static final int COLOR_FormatL2 = 33; @Deprecated
/*      */     public static final int COLOR_FormatL24 = 37; @Deprecated
/*  146 */     public static final int COLOR_FormatL32 = 38; public boolean isFeatureSupported(String name) { throw new RuntimeException("Stub!"); } @Deprecated public static final int COLOR_FormatL4 = 34; public static final int COLOR_FormatL8 = 35; @Deprecated public static final int COLOR_FormatMonochrome = 1; public static final int COLOR_FormatRGBAFlexible = 2134288520; public static final int COLOR_FormatRGBFlexible = 2134292616; public static final int COLOR_FormatRawBayer10bit = 31; public static final int COLOR_FormatRawBayer8bit = 30; public static final int COLOR_FormatRawBayer8bitcompressed = 32; public static final int COLOR_FormatSurface = 2130708361; @Deprecated public static final int COLOR_FormatYCbYCr = 25; @Deprecated public static final int COLOR_FormatYCrYCb = 26; @Deprecated
/*      */     public static final int COLOR_FormatYUV411PackedPlanar = 18; @Deprecated
/*      */     public static final int COLOR_FormatYUV411Planar = 17; public static final int COLOR_FormatYUV420Flexible = 2135033992; @Deprecated
/*      */     public static final int COLOR_FormatYUV420PackedPlanar = 20; @Deprecated
/*      */     public static final int COLOR_FormatYUV420PackedSemiPlanar = 39; @Deprecated
/*      */     public static final int COLOR_FormatYUV420Planar = 19; @Deprecated
/*      */     public static final int COLOR_FormatYUV420SemiPlanar = 21; public static final int COLOR_FormatYUV422Flexible = 2135042184; @Deprecated
/*      */     public static final int COLOR_FormatYUV422PackedPlanar = 23; @Deprecated
/*      */     public static final int COLOR_FormatYUV422PackedSemiPlanar = 40; @Deprecated
/*  155 */     public static final int COLOR_FormatYUV422Planar = 22; public boolean isFeatureRequired(String name) { throw new RuntimeException("Stub!"); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int COLOR_FormatYUV422SemiPlanar = 24;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COLOR_FormatYUV444Flexible = 2135181448;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int COLOR_FormatYUV444Interleaved = 29;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int COLOR_QCOM_FormatYUV420SemiPlanar = 2141391872;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int COLOR_TI_FormatYUV420PackedSemiPlanar = 2130706688;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String FEATURE_AdaptivePlayback = "adaptive-playback";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String FEATURE_IntraRefresh = "intra-refresh";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String FEATURE_PartialFrame = "partial-frame";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String FEATURE_SecurePlayback = "secure-playback";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String FEATURE_TunneledPlayback = "tunneled-playback";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int[] colorFormats;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaCodecInfo.CodecProfileLevel[] profileLevels;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isFormatSupported(MediaFormat format) {
/*  239 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaFormat getDefaultFormat() {
/*  246 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String getMimeType() {
/*  252 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getMaxSupportedInstances() {
/*  263 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaCodecInfo.AudioCapabilities getAudioCapabilities() {
/*  269 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaCodecInfo.EncoderCapabilities getEncoderCapabilities() {
/*  275 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaCodecInfo.VideoCapabilities getVideoCapabilities() {
/*  281 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static CodecCapabilities createFromProfileLevel(String mime, int profile, int level) {
/*  292 */       throw new RuntimeException("Stub!");
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class CodecProfileLevel
/*      */   {
/*      */     public static final int AACObjectELD = 39;
/*      */ 
/*      */     
/*      */     public static final int AACObjectERLC = 17;
/*      */ 
/*      */     
/*      */     public static final int AACObjectERScalable = 20;
/*      */ 
/*      */     
/*      */     public static final int AACObjectHE = 5;
/*      */ 
/*      */     
/*      */     public static final int AACObjectHE_PS = 29;
/*      */ 
/*      */     
/*      */     public static final int AACObjectLC = 2;
/*      */ 
/*      */     
/*      */     public static final int AACObjectLD = 23;
/*      */ 
/*      */     
/*      */     public static final int AACObjectLTP = 4;
/*      */ 
/*      */     
/*      */     public static final int AACObjectMain = 1;
/*      */ 
/*      */     
/*      */     public static final int AACObjectSSR = 3;
/*      */ 
/*      */     
/*      */     public static final int AACObjectScalable = 6;
/*      */ 
/*      */     
/*      */     public static final int AACObjectXHE = 42;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel1 = 1;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel11 = 4;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel12 = 8;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel13 = 16;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel1b = 2;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel2 = 32;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel21 = 64;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel22 = 128;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel3 = 256;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel31 = 512;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel32 = 1024;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel4 = 2048;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel41 = 4096;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel42 = 8192;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel5 = 16384;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel51 = 32768;
/*      */ 
/*      */     
/*      */     public static final int AVCLevel52 = 65536;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileBaseline = 1;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileConstrainedBaseline = 65536;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileConstrainedHigh = 524288;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileExtended = 4;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileHigh = 8;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileHigh10 = 16;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileHigh422 = 32;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileHigh444 = 64;
/*      */ 
/*      */     
/*      */     public static final int AVCProfileMain = 2;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelFhd24 = 4;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelFhd30 = 8;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelFhd60 = 16;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelHd24 = 1;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelHd30 = 2;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelUhd24 = 32;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelUhd30 = 64;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelUhd48 = 128;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionLevelUhd60 = 256;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionProfileDvavPen = 2;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionProfileDvavPer = 1;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionProfileDvavSe = 512;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionProfileDvheDen = 8;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionProfileDvheDer = 4;
/*      */ 
/*      */     
/*      */     public static final int DolbyVisionProfileDvheDtb = 128;
/*      */     
/*      */     public static final int DolbyVisionProfileDvheDth = 64;
/*      */     
/*      */     public static final int DolbyVisionProfileDvheDtr = 16;
/*      */     
/*      */     public static final int DolbyVisionProfileDvheSt = 256;
/*      */     
/*      */     public static final int DolbyVisionProfileDvheStn = 32;
/*      */     
/*      */     public static final int H263Level10 = 1;
/*      */     
/*      */     public static final int H263Level20 = 2;
/*      */     
/*      */     public static final int H263Level30 = 4;
/*      */     
/*      */     public static final int H263Level40 = 8;
/*      */     
/*      */     public static final int H263Level45 = 16;
/*      */     
/*      */     public static final int H263Level50 = 32;
/*      */     
/*      */     public static final int H263Level60 = 64;
/*      */     
/*      */     public static final int H263Level70 = 128;
/*      */     
/*      */     public static final int H263ProfileBackwardCompatible = 4;
/*      */     
/*      */     public static final int H263ProfileBaseline = 1;
/*      */     
/*      */     public static final int H263ProfileH320Coding = 2;
/*      */     
/*      */     public static final int H263ProfileHighCompression = 32;
/*      */     
/*      */     public static final int H263ProfileHighLatency = 256;
/*      */     
/*      */     public static final int H263ProfileISWV2 = 8;
/*      */     
/*      */     public static final int H263ProfileISWV3 = 16;
/*      */     
/*      */     public static final int H263ProfileInterlace = 128;
/*      */     
/*      */     public static final int H263ProfileInternet = 64;
/*      */     
/*      */     public static final int HEVCHighTierLevel1 = 2;
/*      */     
/*      */     public static final int HEVCHighTierLevel2 = 8;
/*      */     
/*      */     public static final int HEVCHighTierLevel21 = 32;
/*      */     
/*      */     public static final int HEVCHighTierLevel3 = 128;
/*      */     
/*      */     public static final int HEVCHighTierLevel31 = 512;
/*      */     
/*      */     public static final int HEVCHighTierLevel4 = 2048;
/*      */     
/*      */     public static final int HEVCHighTierLevel41 = 8192;
/*      */     
/*      */     public static final int HEVCHighTierLevel5 = 32768;
/*      */     
/*      */     public static final int HEVCHighTierLevel51 = 131072;
/*      */     
/*      */     public static final int HEVCHighTierLevel52 = 524288;
/*      */     
/*      */     public static final int HEVCHighTierLevel6 = 2097152;
/*      */     
/*      */     public static final int HEVCHighTierLevel61 = 8388608;
/*      */     
/*      */     public static final int HEVCHighTierLevel62 = 33554432;
/*      */     
/*      */     public static final int HEVCMainTierLevel1 = 1;
/*      */     
/*      */     public static final int HEVCMainTierLevel2 = 4;
/*      */     
/*      */     public static final int HEVCMainTierLevel21 = 16;
/*      */     
/*      */     public static final int HEVCMainTierLevel3 = 64;
/*      */     
/*      */     public static final int HEVCMainTierLevel31 = 256;
/*      */     
/*      */     public static final int HEVCMainTierLevel4 = 1024;
/*      */     
/*      */     public static final int HEVCMainTierLevel41 = 4096;
/*      */     
/*      */     public static final int HEVCMainTierLevel5 = 16384;
/*      */     
/*      */     public static final int HEVCMainTierLevel51 = 65536;
/*      */     
/*      */     public static final int HEVCMainTierLevel52 = 262144;
/*      */     
/*      */     public static final int HEVCMainTierLevel6 = 1048576;
/*      */     
/*      */     public static final int HEVCMainTierLevel61 = 4194304;
/*      */     
/*      */     public static final int HEVCMainTierLevel62 = 16777216;
/*      */     
/*      */     public static final int HEVCProfileMain = 1;
/*      */     
/*      */     public static final int HEVCProfileMain10 = 2;
/*      */     
/*      */     public static final int HEVCProfileMain10HDR10 = 4096;
/*      */     
/*      */     public static final int HEVCProfileMainStill = 4;
/*      */     
/*      */     public static final int MPEG2LevelH14 = 2;
/*      */     
/*      */     public static final int MPEG2LevelHL = 3;
/*      */     
/*      */     public static final int MPEG2LevelHP = 4;
/*      */     
/*      */     public static final int MPEG2LevelLL = 0;
/*      */     
/*      */     public static final int MPEG2LevelML = 1;
/*      */     
/*      */     public static final int MPEG2Profile422 = 2;
/*      */     
/*      */     public static final int MPEG2ProfileHigh = 5;
/*      */     
/*      */     public static final int MPEG2ProfileMain = 1;
/*      */     
/*      */     public static final int MPEG2ProfileSNR = 3;
/*      */     
/*      */     public static final int MPEG2ProfileSimple = 0;
/*      */     
/*      */     public static final int MPEG2ProfileSpatial = 4;
/*      */     
/*      */     public static final int MPEG4Level0 = 1;
/*      */     
/*      */     public static final int MPEG4Level0b = 2;
/*      */     
/*      */     public static final int MPEG4Level1 = 4;
/*      */     
/*      */     public static final int MPEG4Level2 = 8;
/*      */     
/*      */     public static final int MPEG4Level3 = 16;
/*      */     
/*      */     public static final int MPEG4Level3b = 24;
/*      */     
/*      */     public static final int MPEG4Level4 = 32;
/*      */     
/*      */     public static final int MPEG4Level4a = 64;
/*      */     
/*      */     public static final int MPEG4Level5 = 128;
/*      */     
/*      */     public static final int MPEG4Level6 = 256;
/*      */     
/*      */     public static final int MPEG4ProfileAdvancedCoding = 4096;
/*      */     
/*      */     public static final int MPEG4ProfileAdvancedCore = 8192;
/*      */     
/*      */     public static final int MPEG4ProfileAdvancedRealTime = 1024;
/*      */     
/*      */     public static final int MPEG4ProfileAdvancedScalable = 16384;
/*      */     
/*      */     public static final int MPEG4ProfileAdvancedSimple = 32768;
/*      */     
/*      */     public static final int MPEG4ProfileBasicAnimated = 256;
/*      */     
/*      */     public static final int MPEG4ProfileCore = 4;
/*      */     
/*      */     public static final int MPEG4ProfileCoreScalable = 2048;
/*      */     
/*      */     public static final int MPEG4ProfileHybrid = 512;
/*      */     
/*      */     public static final int MPEG4ProfileMain = 8;
/*      */     
/*      */     public static final int MPEG4ProfileNbit = 16;
/*      */     
/*      */     public static final int MPEG4ProfileScalableTexture = 32;
/*      */     
/*      */     public static final int MPEG4ProfileSimple = 1;
/*      */     
/*      */     public static final int MPEG4ProfileSimpleFBA = 128;
/*      */     
/*      */     public static final int MPEG4ProfileSimpleFace = 64;
/*      */     
/*      */     public static final int MPEG4ProfileSimpleScalable = 2;
/*      */     
/*      */     public static final int VP8Level_Version0 = 1;
/*      */     
/*      */     public static final int VP8Level_Version1 = 2;
/*      */     
/*      */     public static final int VP8Level_Version2 = 4;
/*      */     
/*      */     public static final int VP8Level_Version3 = 8;
/*      */     
/*      */     public static final int VP8ProfileMain = 1;
/*      */     
/*      */     public static final int VP9Level1 = 1;
/*      */     
/*      */     public static final int VP9Level11 = 2;
/*      */     
/*      */     public static final int VP9Level2 = 4;
/*      */     
/*      */     public static final int VP9Level21 = 8;
/*      */     
/*      */     public static final int VP9Level3 = 16;
/*      */     
/*      */     public static final int VP9Level31 = 32;
/*      */     
/*      */     public static final int VP9Level4 = 64;
/*      */     
/*      */     public static final int VP9Level41 = 128;
/*      */     
/*      */     public static final int VP9Level5 = 256;
/*      */     
/*      */     public static final int VP9Level51 = 512;
/*      */     
/*      */     public static final int VP9Level52 = 1024;
/*      */     
/*      */     public static final int VP9Level6 = 2048;
/*      */     
/*      */     public static final int VP9Level61 = 4096;
/*      */     
/*      */     public static final int VP9Level62 = 8192;
/*      */     
/*      */     public static final int VP9Profile0 = 1;
/*      */     
/*      */     public static final int VP9Profile1 = 2;
/*      */     
/*      */     public static final int VP9Profile2 = 4;
/*      */     
/*      */     public static final int VP9Profile2HDR = 4096;
/*      */     
/*      */     public static final int VP9Profile3 = 8;
/*      */     
/*      */     public static final int VP9Profile3HDR = 8192;
/*      */     
/*      */     public int level;
/*      */     
/*      */     public int profile;
/*      */ 
/*      */     
/*      */     public CodecProfileLevel() {
/*  690 */       throw new RuntimeException("Stub!");
/*      */     } public boolean equals(Object obj) {
/*  692 */       throw new RuntimeException("Stub!");
/*      */     } public int hashCode() {
/*  694 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class EncoderCapabilities
/*      */   {
/*      */     public static final int BITRATE_MODE_CBR = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BITRATE_MODE_CQ = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BITRATE_MODE_VBR = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     EncoderCapabilities() {
/* 1058 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getQualityRange() {
/* 1067 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getComplexityRange() {
/* 1078 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isBitrateModeSupported(int mode) {
/* 1084 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class VideoCapabilities
/*      */   {
/*      */     VideoCapabilities() {
/* 1106 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getBitrateRange() {
/* 1112 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getSupportedWidths() {
/* 1118 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getSupportedHeights() {
/* 1124 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getWidthAlignment() {
/* 1133 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getHeightAlignment() {
/* 1142 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getSupportedFrameRates() {
/* 1153 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getSupportedWidthsFor(int height) {
/* 1160 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Integer> getSupportedHeightsFor(int width) {
/* 1167 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Range<Double> getSupportedFrameRatesFor(int width, int height) {
/* 1181 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @RecentlyNullable
/*      */     public Range<Double> getAchievableFrameRatesFor(int width, int height) {
/* 1228 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean areSizeAndRateSupported(int width, int height, double frameRate) {
/* 1235 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isSizeSupported(int width, int height) {
/* 1242 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaCodecInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */