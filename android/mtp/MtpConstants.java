/*    */ package android.mtp;public final class MtpConstants {
/*    */   public static final int ASSOCIATION_TYPE_GENERIC_FOLDER = 1;
/*    */   public static final int FORMAT_3GP_CONTAINER = 47492;
/*    */   public static final int FORMAT_AAC = 47363;
/*    */   public static final int FORMAT_ABSTRACT_AUDIO_ALBUM = 47619;
/*    */   public static final int FORMAT_ABSTRACT_AUDIO_PLAYLIST = 47625;
/*    */   public static final int FORMAT_ABSTRACT_AV_PLAYLIST = 47621;
/*    */   public static final int FORMAT_ABSTRACT_DOCUMENT = 47745;
/*    */   public static final int FORMAT_ABSTRACT_IMAGE_ALBUM = 47618;
/*    */   public static final int FORMAT_ABSTRACT_MEDIACAST = 47627;
/*    */   public static final int FORMAT_ABSTRACT_MULTIMEDIA_ALBUM = 47617;
/*    */   public static final int FORMAT_ABSTRACT_VIDEO_ALBUM = 47620;
/*    */   public static final int FORMAT_ABSTRACT_VIDEO_PLAYLIST = 47626;
/*    */   public static final int FORMAT_AIFF = 12295;
/*    */   public static final int FORMAT_ASF = 12300;
/*    */   public static final int FORMAT_ASSOCIATION = 12289;
/*    */   public static final int FORMAT_ASX_PLAYLIST = 47635;
/*    */   public static final int FORMAT_AUDIBLE = 47364;
/*    */   public static final int FORMAT_AVI = 12298;
/*    */   public static final int FORMAT_BMP = 14340;
/*    */   public static final int FORMAT_DEFINED = 14336;
/*    */   public static final int FORMAT_DNG = 14353;
/*    */   public static final int FORMAT_DPOF = 12294;
/*    */   public static final int FORMAT_EXECUTABLE = 12291;
/*    */   public static final int FORMAT_EXIF_JPEG = 14337;
/*    */   
/*    */   public MtpConstants() {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   public static final int FORMAT_FLAC = 47366; public static final int FORMAT_GIF = 14343; public static final int FORMAT_HTML = 12293; public static final int FORMAT_JFIF = 14344; public static final int FORMAT_JP2 = 14351; public static final int FORMAT_JPX = 14352; public static final int FORMAT_M3U_PLAYLIST = 47633; public static final int FORMAT_MP2 = 47491; public static final int FORMAT_MP3 = 12297; public static final int FORMAT_MP4_CONTAINER = 47490; public static final int FORMAT_MPEG = 12299; public static final int FORMAT_MPL_PLAYLIST = 47634; public static final int FORMAT_MS_EXCEL_SPREADSHEET = 47749; public static final int FORMAT_MS_POWERPOINT_PRESENTATION = 47750; public static final int FORMAT_MS_WORD_DOCUMENT = 47747; public static final int FORMAT_OGG = 47362; public static final int FORMAT_PICT = 14346; public static final int FORMAT_PLS_PLAYLIST = 47636; public static final int FORMAT_PNG = 14347; public static final int FORMAT_SCRIPT = 12290; public static final int FORMAT_TEXT = 12292; public static final int FORMAT_TIFF = 14349; public static final int FORMAT_TIFF_EP = 14338; public static final int FORMAT_UNDEFINED = 12288; public static final int FORMAT_UNDEFINED_AUDIO = 47360; public static final int FORMAT_UNDEFINED_COLLECTION = 47616; public static final int FORMAT_UNDEFINED_DOCUMENT = 47744; public static final int FORMAT_UNDEFINED_FIRMWARE = 47106; public static final int FORMAT_UNDEFINED_VIDEO = 47488; public static final int FORMAT_WAV = 12296; public static final int FORMAT_WINDOWS_IMAGE_FORMAT = 47233; public static final int FORMAT_WMA = 47361; public static final int FORMAT_WMV = 47489; public static final int FORMAT_WPL_PLAYLIST = 47632; public static final int FORMAT_XML_DOCUMENT = 47746; public static final int OPERATION_CLOSE_SESSION = 4099; public static final int OPERATION_COPY_OBJECT = 4122; public static final int OPERATION_DELETE_OBJECT = 4107; public static final int OPERATION_FORMAT_STORE = 4111; public static final int OPERATION_GET_DEVICE_INFO = 4097; public static final int OPERATION_GET_DEVICE_PROP_DESC = 4116; public static final int OPERATION_GET_DEVICE_PROP_VALUE = 4117; public static final int OPERATION_GET_NUM_OBJECTS = 4102; public static final int OPERATION_GET_OBJECT = 4105; public static final int OPERATION_GET_OBJECT_HANDLES = 4103;
/*    */   public static final int OPERATION_GET_OBJECT_INFO = 4104;
/*    */   public static final int OPERATION_GET_OBJECT_PROPS_SUPPORTED = 38913;
/*    */   public static final int OPERATION_GET_OBJECT_PROP_DESC = 38914;
/*    */   public static final int OPERATION_GET_OBJECT_PROP_VALUE = 38915;
/*    */   public static final int OPERATION_GET_OBJECT_REFERENCES = 38928;
/*    */   
/*    */   public static boolean isAbstractObject(int format) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static final int OPERATION_GET_PARTIAL_OBJECT = 4123;
/*    */   public static final int OPERATION_GET_PARTIAL_OBJECT_64 = 38337;
/*    */   public static final int OPERATION_GET_STORAGE_INFO = 4101;
/*    */   public static final int OPERATION_GET_STORAGE_I_DS = 4100;
/*    */   public static final int OPERATION_GET_THUMB = 4106;
/*    */   public static final int OPERATION_INITIATE_CAPTURE = 4110;
/*    */   public static final int OPERATION_INITIATE_OPEN_CAPTURE = 4124;
/*    */   public static final int OPERATION_MOVE_OBJECT = 4121;
/*    */   public static final int OPERATION_OPEN_SESSION = 4098;
/*    */   public static final int OPERATION_POWER_DOWN = 4115;
/*    */   public static final int OPERATION_RESET_DEVICE = 4112;
/*    */   public static final int OPERATION_RESET_DEVICE_PROP_VALUE = 4119;
/*    */   public static final int OPERATION_SELF_TEST = 4113;
/*    */   public static final int OPERATION_SEND_OBJECT = 4109;
/*    */   public static final int OPERATION_SEND_OBJECT_INFO = 4108;
/*    */   public static final int OPERATION_SET_DEVICE_PROP_VALUE = 4118;
/*    */   public static final int OPERATION_SET_OBJECT_PROP_VALUE = 38916;
/*    */   public static final int OPERATION_SET_OBJECT_PROTECTION = 4114;
/*    */   public static final int OPERATION_SET_OBJECT_REFERENCES = 38929;
/*    */   public static final int OPERATION_SKIP = 38944;
/*    */   public static final int OPERATION_TERMINATE_OPEN_CAPTURE = 4120;
/*    */   public static final int PROTECTION_STATUS_NONE = 0;
/*    */   public static final int PROTECTION_STATUS_NON_TRANSFERABLE_DATA = 32771;
/*    */   public static final int PROTECTION_STATUS_READ_ONLY = 32769;
/*    */   public static final int PROTECTION_STATUS_READ_ONLY_DATA = 32770;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\mtp\MtpConstants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */