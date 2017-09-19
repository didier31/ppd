package org.xtext.ppd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPpdLexer extends Lexer {
    public static final int RULE_RJ=15;
    public static final int RULE_LA=11;
    public static final int RULE_ENDRJ=16;
    public static final int RULE_GRID=13;
    public static final int RULE_STRING=19;
    public static final int RULE_VST=9;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_STRICT=7;
    public static final int RULE_ENDGRID=14;
    public static final int RULE_PAGE=4;
    public static final int RULE_HST=10;
    public static final int EOF=-1;
    public static final int RULE_ENDLA=12;
    public static final int RULE_ID=18;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_ENDPAGE=5;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__23=23;
    public static final int RULE_TEXT=8;
    public static final int T__24=24;

    // delegates
    // delegators

    public InternalPpdLexer() {;} 
    public InternalPpdLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPpdLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPpd.g"; }

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:11:7: ( '>' )
            // InternalPpd.g:11:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:12:7: ( '+' )
            // InternalPpd.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_VST"
    public final void mRULE_VST() throws RecognitionException {
        try {
            int _type = RULE_VST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:693:10: ( '<VS' )
            // InternalPpd.g:693:12: '<VS'
            {
            match("<VS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VST"

    // $ANTLR start "RULE_HST"
    public final void mRULE_HST() throws RecognitionException {
        try {
            int _type = RULE_HST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:695:10: ( '<HS' )
            // InternalPpd.g:695:12: '<HS'
            {
            match("<HS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HST"

    // $ANTLR start "RULE_LA"
    public final void mRULE_LA() throws RecognitionException {
        try {
            int _type = RULE_LA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:697:9: ( '<LA>' )
            // InternalPpd.g:697:11: '<LA>'
            {
            match("<LA>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LA"

    // $ANTLR start "RULE_ENDLA"
    public final void mRULE_ENDLA() throws RecognitionException {
        try {
            int _type = RULE_ENDLA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:699:12: ( '<LA/>' )
            // InternalPpd.g:699:14: '<LA/>'
            {
            match("<LA/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDLA"

    // $ANTLR start "RULE_PAGE"
    public final void mRULE_PAGE() throws RecognitionException {
        try {
            int _type = RULE_PAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:701:11: ( '<P' )
            // InternalPpd.g:701:13: '<P'
            {
            match("<P"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PAGE"

    // $ANTLR start "RULE_ENDPAGE"
    public final void mRULE_ENDPAGE() throws RecognitionException {
        try {
            int _type = RULE_ENDPAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:703:14: ( '<P/>' )
            // InternalPpd.g:703:16: '<P/>'
            {
            match("<P/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDPAGE"

    // $ANTLR start "RULE_GRID"
    public final void mRULE_GRID() throws RecognitionException {
        try {
            int _type = RULE_GRID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:705:11: ( '<G' )
            // InternalPpd.g:705:13: '<G'
            {
            match("<G"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GRID"

    // $ANTLR start "RULE_ENDGRID"
    public final void mRULE_ENDGRID() throws RecognitionException {
        try {
            int _type = RULE_ENDGRID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:707:14: ( '<G/>' )
            // InternalPpd.g:707:16: '<G/>'
            {
            match("<G/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDGRID"

    // $ANTLR start "RULE_RJ"
    public final void mRULE_RJ() throws RecognitionException {
        try {
            int _type = RULE_RJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:709:9: ( '<RJ>' )
            // InternalPpd.g:709:11: '<RJ>'
            {
            match("<RJ>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RJ"

    // $ANTLR start "RULE_ENDRJ"
    public final void mRULE_ENDRJ() throws RecognitionException {
        try {
            int _type = RULE_ENDRJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:711:12: ( '<RJ/>' )
            // InternalPpd.g:711:14: '<RJ/>'
            {
            match("<RJ/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDRJ"

    // $ANTLR start "RULE_STRICT"
    public final void mRULE_STRICT() throws RecognitionException {
        try {
            int _type = RULE_STRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:713:13: ( 'STRICT' )
            // InternalPpd.g:713:15: 'STRICT'
            {
            match("STRICT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRICT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:715:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPpd.g:715:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPpd.g:715:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPpd.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:717:11: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalPpd.g:717:13: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalPpd.g:717:17: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPpd.g:717:18: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalPpd.g:717:63: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:719:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPpd.g:719:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPpd.g:719:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPpd.g:719:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPpd.g:719:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPpd.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:721:10: ( ( '0' .. '9' )+ )
            // InternalPpd.g:721:12: ( '0' .. '9' )+
            {
            // InternalPpd.g:721:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPpd.g:721:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:723:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPpd.g:723:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPpd.g:723:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPpd.g:723:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPpd.g:723:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPpd.g:723:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPpd.g:723:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPpd.g:723:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPpd.g:723:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPpd.g:723:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPpd.g:723:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:725:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPpd.g:725:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPpd.g:725:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPpd.g:725:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:727:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPpd.g:727:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPpd.g:727:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPpd.g:727:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalPpd.g:727:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPpd.g:727:41: ( '\\r' )? '\\n'
                    {
                    // InternalPpd.g:727:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPpd.g:727:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPpd.g:729:16: ( . )
            // InternalPpd.g:729:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPpd.g:1:8: ( T__23 | T__24 | RULE_VST | RULE_HST | RULE_LA | RULE_ENDLA | RULE_PAGE | RULE_ENDPAGE | RULE_GRID | RULE_ENDGRID | RULE_RJ | RULE_ENDRJ | RULE_STRICT | RULE_WS | RULE_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt13=21;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalPpd.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // InternalPpd.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // InternalPpd.g:1:22: RULE_VST
                {
                mRULE_VST(); 

                }
                break;
            case 4 :
                // InternalPpd.g:1:31: RULE_HST
                {
                mRULE_HST(); 

                }
                break;
            case 5 :
                // InternalPpd.g:1:40: RULE_LA
                {
                mRULE_LA(); 

                }
                break;
            case 6 :
                // InternalPpd.g:1:48: RULE_ENDLA
                {
                mRULE_ENDLA(); 

                }
                break;
            case 7 :
                // InternalPpd.g:1:59: RULE_PAGE
                {
                mRULE_PAGE(); 

                }
                break;
            case 8 :
                // InternalPpd.g:1:69: RULE_ENDPAGE
                {
                mRULE_ENDPAGE(); 

                }
                break;
            case 9 :
                // InternalPpd.g:1:82: RULE_GRID
                {
                mRULE_GRID(); 

                }
                break;
            case 10 :
                // InternalPpd.g:1:92: RULE_ENDGRID
                {
                mRULE_ENDGRID(); 

                }
                break;
            case 11 :
                // InternalPpd.g:1:105: RULE_RJ
                {
                mRULE_RJ(); 

                }
                break;
            case 12 :
                // InternalPpd.g:1:113: RULE_ENDRJ
                {
                mRULE_ENDRJ(); 

                }
                break;
            case 13 :
                // InternalPpd.g:1:124: RULE_STRICT
                {
                mRULE_STRICT(); 

                }
                break;
            case 14 :
                // InternalPpd.g:1:136: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalPpd.g:1:144: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 16 :
                // InternalPpd.g:1:154: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalPpd.g:1:162: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalPpd.g:1:171: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalPpd.g:1:183: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalPpd.g:1:199: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalPpd.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\3\uffff\1\14\1\26\1\uffff\2\14\2\uffff\2\14\6\uffff\1\41\1\43\1\uffff\1\26\17\uffff\1\26\6\uffff\2\26\1\57\1\uffff";
    static final String DFA13_eofS =
        "\60\uffff";
    static final String DFA13_minS =
        "\1\0\2\uffff\1\107\1\124\1\uffff\1\0\1\101\2\uffff\1\0\1\52\5\uffff\1\101\2\57\1\112\1\122\2\uffff\2\0\5\uffff\1\57\4\uffff\1\57\1\111\1\0\5\uffff\1\103\1\124\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\uffff\1\126\1\124\1\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\5\uffff\1\101\2\57\1\112\1\122\2\uffff\2\uffff\5\uffff\1\76\4\uffff\1\76\1\111\1\uffff\5\uffff\1\103\1\124\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\16\2\uffff\1\20\1\21\2\uffff\1\25\1\1\1\2\1\3\1\4\5\uffff\1\20\1\16\2\uffff\1\17\1\21\1\22\1\23\1\24\1\uffff\1\10\1\7\1\12\1\11\3\uffff\1\17\1\5\1\6\1\13\1\14\3\uffff\1\15";
    static final String DFA13_specialS =
        "\1\3\5\uffff\1\4\3\uffff\1\5\15\uffff\1\2\1\1\14\uffff\1\0\11\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\14\2\5\2\14\1\5\22\14\1\5\1\14\1\6\4\14\1\12\3\14\1\2\3\14\1\13\12\11\2\14\1\3\1\14\1\1\2\14\22\10\1\4\7\10\3\14\1\7\1\10\1\14\32\10\uff85\14",
            "",
            "",
            "\1\23\1\20\3\uffff\1\21\3\uffff\1\22\1\uffff\1\24\3\uffff\1\17",
            "\1\25",
            "",
            "\42\31\1\32\71\31\1\30\uffa3\31",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\34",
            "\1\35\4\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\42",
            "\1\44",
            "\1\45",
            "",
            "",
            "\42\34\1\46\4\34\1\46\64\34\1\46\5\34\1\46\3\34\1\46\7\34\1\46\3\34\1\46\1\34\2\46\uff8a\34",
            "\42\31\1\32\71\31\1\30\uffa3\31",
            "",
            "",
            "",
            "",
            "",
            "\1\51\16\uffff\1\50",
            "",
            "",
            "",
            "",
            "\1\53\16\uffff\1\52",
            "\1\54",
            "\42\31\1\32\71\31\1\30\uffa3\31",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__23 | T__24 | RULE_VST | RULE_HST | RULE_LA | RULE_ENDLA | RULE_PAGE | RULE_ENDPAGE | RULE_GRID | RULE_ENDGRID | RULE_RJ | RULE_ENDRJ | RULE_STRICT | RULE_WS | RULE_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( (LA13_38=='\"') ) {s = 26;}

                        else if ( (LA13_38=='\\') ) {s = 24;}

                        else if ( ((LA13_38>='\u0000' && LA13_38<='!')||(LA13_38>='#' && LA13_38<='[')||(LA13_38>=']' && LA13_38<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( (LA13_25=='\"') ) {s = 26;}

                        else if ( (LA13_25=='\\') ) {s = 24;}

                        else if ( ((LA13_25>='\u0000' && LA13_25<='!')||(LA13_25>='#' && LA13_25<='[')||(LA13_25>=']' && LA13_25<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( (LA13_24=='\"'||LA13_24=='\''||LA13_24=='\\'||LA13_24=='b'||LA13_24=='f'||LA13_24=='n'||LA13_24=='r'||(LA13_24>='t' && LA13_24<='u')) ) {s = 38;}

                        else if ( ((LA13_24>='\u0000' && LA13_24<='!')||(LA13_24>='#' && LA13_24<='&')||(LA13_24>='(' && LA13_24<='[')||(LA13_24>=']' && LA13_24<='a')||(LA13_24>='c' && LA13_24<='e')||(LA13_24>='g' && LA13_24<='m')||(LA13_24>='o' && LA13_24<='q')||LA13_24=='s'||(LA13_24>='v' && LA13_24<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='>') ) {s = 1;}

                        else if ( (LA13_0=='+') ) {s = 2;}

                        else if ( (LA13_0=='<') ) {s = 3;}

                        else if ( (LA13_0=='S') ) {s = 4;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 5;}

                        else if ( (LA13_0=='\"') ) {s = 6;}

                        else if ( (LA13_0=='^') ) {s = 7;}

                        else if ( ((LA13_0>='A' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {s = 8;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 9;}

                        else if ( (LA13_0=='\'') ) {s = 10;}

                        else if ( (LA13_0=='/') ) {s = 11;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='*')||(LA13_0>=',' && LA13_0<='.')||(LA13_0>=':' && LA13_0<=';')||LA13_0=='='||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_6 = input.LA(1);

                        s = -1;
                        if ( (LA13_6=='\\') ) {s = 24;}

                        else if ( ((LA13_6>='\u0000' && LA13_6<='!')||(LA13_6>='#' && LA13_6<='[')||(LA13_6>=']' && LA13_6<='\uFFFF')) ) {s = 25;}

                        else if ( (LA13_6=='\"') ) {s = 26;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_10 = input.LA(1);

                        s = -1;
                        if ( ((LA13_10>='\u0000' && LA13_10<='\uFFFF')) ) {s = 28;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}