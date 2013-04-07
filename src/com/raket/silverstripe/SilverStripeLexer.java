/* The following code was generated by JFlex 1.4.3 on 2013-04-07 19:25 */

package com.raket.silverstripe;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.raket.silverstripe.psi.SilverStripeTypes;
import com.raket.silverstripe.psi.SilverStripeTokenType;
import com.intellij.psi.TokenType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2013-04-07 19:25 from the specification file
 * <tt>C:/IdeaProjects/idea-silverstripe/src/com/raket/silverstripe/SilverStripe.flex</tt>
 */
public class SilverStripeLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int SS_VAR = 2;
  public static final int SS_INCLUDE_VARS = 22;
  public static final int SS_TRANSLATION = 12;
  public static final int SS_SINGLE = 28;
  public static final int SS_DOUBLE = 26;
  public static final int SS_METHOD_ARGUMENTS = 18;
  public static final int SS_BLOCK_VAR = 6;
  public static final int SS_BLOCK_START = 4;
  public static final int SS_BAD_BLOCK_STATEMENT = 8;
  public static final int SS_CACHED_STATEMENT = 20;
  public static final int SS_INCLUDE_STATEMENT = 16;
  public static final int YYINITIAL = 0;
  public static final int SS_STRING = 24;
  public static final int SS_IF_STATEMENT = 14;
  public static final int SS_COMMENT = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\41\1\14"+
    "\1\0\1\11\1\20\1\42\1\13\1\5\1\6\2\0\1\4\1\51"+
    "\1\7\1\0\12\10\2\0\1\17\1\40\1\21\2\0\32\12\4\0"+
    "\1\37\1\0\1\45\1\44\1\31\1\50\1\35\1\34\1\46\1\30"+
    "\1\26\2\12\1\22\1\12\1\32\1\23\1\24\1\12\1\33\1\36"+
    "\1\27\1\47\1\12\1\25\3\12\1\15\1\43\1\16\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\14\0\2\2\3\1\1\3\1\4\2\3\1\5"+
    "\1\6\1\3\1\7\1\10\1\11\1\3\2\12\1\13"+
    "\11\12\1\14\1\4\1\14\1\15\2\14\2\4\1\13"+
    "\2\14\2\4\1\13\1\14\1\15\1\16\1\17\1\14"+
    "\1\20\1\21\3\14\1\15\2\14\1\22\1\23\1\24"+
    "\1\25\2\3\1\2\1\26\1\27\1\2\1\30\1\31"+
    "\1\32\1\33\3\0\1\34\10\0\1\35\4\0\1\32"+
    "\1\21\1\0\1\2\1\0\1\15\1\36\1\37\13\0"+
    "\1\40\1\21\1\41\1\42\3\0\1\43\2\0\1\44"+
    "\1\45\13\0\1\46\3\0\1\47\3\0\1\50\1\51"+
    "\7\0\1\52\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276"+
    "\0\u02a0\0\u02ca\0\u02f4\0\u02f4\0\u031e\0\u0348\0\u02f4\0\u02f4"+
    "\0\u0372\0\u039c\0\u02f4\0\u02f4\0\u03c6\0\u02f4\0\u031e\0\u0348"+
    "\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2\0\u04ec\0\u0516"+
    "\0\u0540\0\u02f4\0\u031e\0\u056a\0\u0594\0\u03c6\0\u05be\0\u05be"+
    "\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0666\0\u0690\0\u06ba\0\u06e4"+
    "\0\u070e\0\u02f4\0\u02f4\0\u0738\0\u070e\0\u0762\0\u0762\0\u078c"+
    "\0\u07b6\0\u07e0\0\u080a\0\u0834\0\u085e\0\u02f4\0\u02f4\0\u0888"+
    "\0\u078c\0\u07b6\0\u08b2\0\u02f4\0\u02f4\0\u08dc\0\u02f4\0\u02f4"+
    "\0\u0906\0\u02f4\0\u0930\0\u095a\0\u0984\0\u02f4\0\u09ae\0\u09d8"+
    "\0\u0a02\0\u0a2c\0\u0a56\0\u0a80\0\u05be\0\u063c\0\u02f4\0\u0666"+
    "\0\u06e4\0\u0aaa\0\u0ad4\0\u02f4\0\u02f4\0\u078c\0\u02f4\0\u07b6"+
    "\0\u0afe\0\u02f4\0\u02f4\0\u0b28\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0"+
    "\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc\0\u0ad4\0\u0594"+
    "\0\u02f4\0\u02f4\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8"+
    "\0\u02f4\0\u02f4\0\u0df2\0\u0e1c\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4"+
    "\0\u0eee\0\u0f18\0\u0f42\0\u0f6c\0\u0f96\0\u02f4\0\u0fc0\0\u0fea"+
    "\0\u1014\0\u02f4\0\u103e\0\u1068\0\u1092\0\u02f4\0\u02f4\0\u10bc"+
    "\0\u10e6\0\u1110\0\u113a\0\u1164\0\u118e\0\u11b8\0\u02f4\0\u11e2"+
    "\0\u120c\0\u1236";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\11\1\1\20\3\1\1\21\1\1\1\22\32\1\1\23"+
    "\1\24\1\25\1\26\1\23\1\27\1\23\1\30\1\23"+
    "\1\31\1\32\2\23\1\33\1\34\1\23\1\35\1\23"+
    "\15\32\5\23\5\32\1\23\1\36\1\24\1\37\1\40"+
    "\13\36\1\41\1\42\1\36\1\43\2\36\1\44\1\45"+
    "\2\36\1\46\3\36\1\47\6\36\1\50\4\36\1\51"+
    "\1\52\1\24\1\53\1\40\5\52\1\54\1\55\5\52"+
    "\1\56\1\52\15\55\5\52\5\55\1\52\1\57\1\60"+
    "\1\61\1\62\14\57\1\63\31\57\1\64\1\65\1\66"+
    "\1\67\45\64\1\70\1\52\1\24\1\53\1\40\5\52"+
    "\1\54\1\71\1\72\1\73\2\52\1\74\1\56\1\52"+
    "\5\71\1\75\7\71\1\52\1\76\1\77\2\52\5\71"+
    "\2\52\1\24\1\53\1\40\5\52\1\54\1\55\1\100"+
    "\1\101\3\52\1\56\1\52\10\55\1\102\4\55\1\52"+
    "\1\76\1\77\1\103\1\104\5\55\1\52\1\23\1\24"+
    "\1\25\1\40\6\23\1\105\7\23\16\105\4\23\6\105"+
    "\1\23\1\24\1\25\1\40\1\106\1\23\1\107\1\30"+
    "\1\110\1\31\1\32\1\111\1\112\5\23\15\32\5\23"+
    "\5\32\1\23\1\52\1\24\1\53\1\40\1\106\4\52"+
    "\1\54\1\55\1\100\1\101\3\52\1\56\1\52\15\55"+
    "\5\52\5\55\2\52\1\24\1\53\1\40\1\106\4\52"+
    "\1\54\1\55\5\52\1\56\1\52\15\55\1\52\1\76"+
    "\1\77\2\52\5\55\2\52\1\24\1\53\1\40\46\52"+
    "\14\113\1\114\1\115\34\113\13\116\1\117\1\116\1\115"+
    "\34\116\11\1\1\20\1\0\2\1\1\21\1\1\1\22"+
    "\2\1\15\0\5\1\5\0\12\1\1\0\3\1\1\21"+
    "\1\1\1\22\43\1\1\20\3\1\1\21\1\1\1\22"+
    "\1\0\31\1\53\0\1\24\53\0\1\40\60\0\1\32"+
    "\7\0\15\32\5\0\5\32\11\0\1\32\1\0\1\32"+
    "\7\0\15\32\5\0\5\32\22\0\1\120\50\0\1\121"+
    "\52\0\1\122\53\0\1\123\54\0\1\124\55\0\1\125"+
    "\1\0\1\126\40\0\1\127\21\0\1\130\26\0\1\131"+
    "\7\0\1\132\64\0\1\133\55\0\1\134\12\0\1\55"+
    "\7\0\15\55\5\0\5\55\11\0\1\55\1\0\1\55"+
    "\7\0\15\55\5\0\5\55\1\0\20\135\1\136\32\135"+
    "\1\60\16\135\1\136\34\135\1\62\14\135\1\136\51\135"+
    "\1\136\1\137\30\135\51\140\1\141\1\140\1\65\47\140"+
    "\1\141\3\140\1\67\45\140\1\141\51\140\1\142\7\0"+
    "\1\143\1\55\1\0\1\71\7\0\15\71\5\0\5\71"+
    "\21\0\1\144\71\0\1\145\11\0\13\146\1\147\36\146"+
    "\14\150\1\147\35\150\10\0\1\55\1\0\1\55\7\0"+
    "\1\55\1\151\13\55\5\0\5\55\43\0\1\152\52\0"+
    "\1\152\20\0\1\105\7\0\16\105\4\0\6\105\10\0"+
    "\1\110\41\0\14\113\2\0\34\113\13\116\1\0\1\116"+
    "\1\0\34\116\27\0\1\153\21\0\1\154\23\0\1\155"+
    "\55\0\1\156\53\0\1\157\52\0\1\160\50\0\1\161"+
    "\56\0\1\162\63\0\1\163\37\0\1\164\33\0\1\165"+
    "\31\0\20\140\1\166\30\140\1\142\12\0\1\167\7\0"+
    "\15\167\5\0\5\167\11\0\1\55\1\0\1\55\7\0"+
    "\5\55\1\170\7\55\5\0\5\55\52\0\1\171\24\0"+
    "\1\172\55\0\1\172\43\0\1\173\56\0\1\174\52\0"+
    "\1\175\56\0\1\176\53\0\1\177\47\0\1\200\35\0"+
    "\1\201\30\0\21\140\1\202\27\140\1\141\47\0\1\203"+
    "\35\0\1\204\53\0\1\205\53\0\1\206\34\0\1\207"+
    "\2\0\1\210\1\211\2\0\1\212\57\0\1\213\62\0"+
    "\1\214\24\0\1\215\76\0\1\216\27\0\1\217\46\0"+
    "\1\220\54\0\1\221\57\0\1\222\40\0\1\223\21\0"+
    "\1\224\33\0\1\225\57\0\1\226\36\0\1\172\63\0"+
    "\1\227\40\0\1\230\55\0\1\231\54\0\1\232\50\0"+
    "\1\233\65\0\1\234\30\0\1\222\55\0\1\222\50\0"+
    "\1\235\52\0\1\236\67\0\1\237\36\0\1\240\53\0"+
    "\1\241\37\0\1\242\76\0\1\222\23\0\1\222\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4704];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\14\0\5\1\2\11\2\1\2\11\2\1\2\11"+
    "\1\1\1\11\13\1\1\11\17\1\2\11\12\1\2\11"+
    "\4\1\2\11\1\1\2\11\1\1\1\11\3\0\1\11"+
    "\10\0\1\11\4\0\2\11\1\0\1\11\1\0\1\1"+
    "\2\11\13\0\2\1\2\11\3\0\1\1\2\0\2\11"+
    "\13\0\1\11\3\0\1\11\3\0\2\11\7\0\1\11"+
    "\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushstate(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

    public void yypopstate() {
      yybegin(stack.pop());
    }

    public void yycleanstates() {
       while(!stack.isEmpty()) {
          yybegin(stack.pop());
       }
    }

	public IElementType checkContent() {
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
    	return null;
	}


  public SilverStripeLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public SilverStripeLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 118) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { yypushstate(SS_VAR); return SilverStripeTypes.SS_VAR;
          }
        case 43: break;
        case 39: 
          { return SilverStripeTypes.SS_END_KEYWORD;
          }
        case 44: break;
        case 2: 
          { return SilverStripeTypes.SS_STRING;
          }
        case 45: break;
        case 41: 
          { yypushstate(SS_IF_STATEMENT); return SilverStripeTypes.SS_ELSE_IF_KEYWORD;
          }
        case 46: break;
        case 23: 
          { yypushstate(SS_VAR); return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 47: break;
        case 14: 
          { yypushstate(SS_SINGLE); return SilverStripeTypes.SS_SINGLE_LEFT;
          }
        case 48: break;
        case 42: 
          { yypushstate(SS_BLOCK_VAR); return SilverStripeTypes.SS_SIMPLE_KEYWORD;
          }
        case 49: break;
        case 17: 
          { return SilverStripeTypes.SS_COMPARISON_OPERATOR;
          }
        case 50: break;
        case 11: 
          { return TokenType.WHITE_SPACE;
          }
        case 51: break;
        case 22: 
          { yypopstate(); return SilverStripeTypes.SS_DOUBLE_RIGHT;
          }
        case 52: break;
        case 4: 
          { if (!stack.isEmpty()) {
		   yypopstate(); yypushback(yylength());
		} else {
		return SilverStripeTypes.CRLF;
	}
          }
        case 53: break;
        case 5: 
          { yypushstate(SS_METHOD_ARGUMENTS); return SilverStripeTypes.LEFT_PAREN;
          }
        case 54: break;
        case 8: 
          { return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 55: break;
        case 6: 
          { return SilverStripeTypes.DOT;
          }
        case 56: break;
        case 10: 
          { yypushstate(SS_BAD_BLOCK_STATEMENT); yypushback(yylength());
          }
        case 57: break;
        case 20: 
          { yypopstate(); return SilverStripeTypes.RIGHT_PAREN;
          }
        case 58: break;
        case 25: 
          { yycleanstates(); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 59: break;
        case 33: 
          { yypushstate(SS_COMMENT); return SilverStripeTypes.SS_COMMENT_START;
          }
        case 60: break;
        case 27: 
          { yypopstate(); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 61: break;
        case 35: 
          { return SilverStripeTypes.SS_ELSE_KEYWORD;
          }
        case 62: break;
        case 32: 
          { return SilverStripeTypes.SS_TRANSLATION_IDENTIFIER;
          }
        case 63: break;
        case 24: 
          { yypopstate(); return SilverStripeTypes.SS_SINGLE_RIGHT;
          }
        case 64: break;
        case 29: 
          { yypopstate(); yypushback(2); return SilverStripeTypes.SS_BAD_BLOCK_STATEMENT;
          }
        case 65: break;
        case 16: 
          { return SilverStripeTypes.SS_TRANSLATION_KEYWORD;
          }
        case 66: break;
        case 31: 
          { yypushstate(SS_TRANSLATION);  yypushback(3); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 67: break;
        case 18: 
          { yypushstate(SS_INCLUDE_VARS); return SilverStripeTypes.SS_INCLUDE_FILE;
          }
        case 68: break;
        case 7: 
          { return SilverStripeTypes.SS_VAR;
          }
        case 69: break;
        case 38: 
          { yypushstate(SS_CACHED_STATEMENT); return SilverStripeTypes.SS_CACHED_KEYWORD;
          }
        case 70: break;
        case 34: 
          { yypushstate(SS_BLOCK_VAR); return SilverStripeTypes.SS_START_KEYWORD;
          }
        case 71: break;
        case 9: 
          { yypopstate(); return SilverStripeTypes.SS_VAR_END_DELIMITER;
          }
        case 72: break;
        case 15: 
          { yypushstate(SS_DOUBLE); return SilverStripeTypes.SS_DOUBLE_LEFT;
          }
        case 73: break;
        case 3: 
          { yypopstate(); yypushback(yylength());
          }
        case 74: break;
        case 26: 
          { return SilverStripeTypes.SS_BLOCK_START;
          }
        case 75: break;
        case 12: 
          { return TokenType.BAD_CHARACTER;
/*	if (!stack.isEmpty()) {
	   yypopstate(); yypushback(yylength());
	} else {
		return TokenType.BAD_CHARACTER;
	}*/
          }
        case 76: break;
        case 37: 
          { yypopstate(); yypushback(4); return SilverStripeTypes.COMMENT;
          }
        case 77: break;
        case 40: 
          { yypushstate(SS_INCLUDE_STATEMENT); return SilverStripeTypes.SS_INCLUDE_KEYWORD;
          }
        case 78: break;
        case 28: 
          { yypushstate(SS_IF_STATEMENT); return SilverStripeTypes.SS_IF_KEYWORD;
          }
        case 79: break;
        case 1: 
          { if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("<")) {
            yypushback(1);
            yypushstate(SS_BLOCK_START);
        }
        if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("$") ||
            yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("{") ) {
            yypushback(1);
            yypushstate(SS_VAR);
        }

        // we stray from the Handlebars grammar a bit here since we need our WHITE_SPACE more clearly delineated
        //    and we need to avoid creating extra tokens for empty strings (makes the parser and formatter happier)
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
          }
        case 80: break;
        case 36: 
          { yypopstate(); return SilverStripeTypes.SS_COMMENT_END;
          }
        case 81: break;
        case 21: 
          { return SilverStripeTypes.NUMBER;
          }
        case 82: break;
        case 30: 
          { return SilverStripeTypes.SS_AND_OR_OPERATOR;
          }
        case 83: break;
        case 19: 
          { return SilverStripeTypes.COMMA;
          }
        case 84: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
