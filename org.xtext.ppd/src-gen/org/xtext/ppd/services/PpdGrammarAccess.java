/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PpdGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.Document");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDocumentAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cPAGETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cPaperAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPaperPaperParserRuleCall_2_0 = (RuleCall)cPaperAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cContentsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cContentsContentParserRuleCall_4_0 = (RuleCall)cContentsAssignment_4.eContents().get(0);
		private final RuleCall cENDPAGETerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Document:
		//	{Document} PAGE paper=Paper? '>' contents+=Content* ENDPAGE?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Document} PAGE paper=Paper? '>' contents+=Content* ENDPAGE?
		public Group getGroup() { return cGroup; }
		
		//{Document}
		public Action getDocumentAction_0() { return cDocumentAction_0; }
		
		//PAGE
		public RuleCall getPAGETerminalRuleCall_1() { return cPAGETerminalRuleCall_1; }
		
		//paper=Paper?
		public Assignment getPaperAssignment_2() { return cPaperAssignment_2; }
		
		//Paper
		public RuleCall getPaperPaperParserRuleCall_2_0() { return cPaperPaperParserRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//contents+=Content*
		public Assignment getContentsAssignment_4() { return cContentsAssignment_4; }
		
		//Content
		public RuleCall getContentsContentParserRuleCall_4_0() { return cContentsContentParserRuleCall_4_0; }
		
		//ENDPAGE?
		public RuleCall getENDPAGETerminalRuleCall_5() { return cENDPAGETerminalRuleCall_5; }
	}
	public class PaperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.Paper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWidthAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cWidthINTTerminalRuleCall_0_0 = (RuleCall)cWidthAssignment_0.eContents().get(0);
		private final Assignment cFoldingAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFoldingSTRICTTerminalRuleCall_1_0 = (RuleCall)cFoldingAssignment_1.eContents().get(0);
		
		//Paper:
		//	width=INT folding?=STRICT?;
		@Override public ParserRule getRule() { return rule; }
		
		//width=INT folding?=STRICT?
		public Group getGroup() { return cGroup; }
		
		//width=INT
		public Assignment getWidthAssignment_0() { return cWidthAssignment_0; }
		
		//INT
		public RuleCall getWidthINTTerminalRuleCall_0_0() { return cWidthINTTerminalRuleCall_0_0; }
		
		//folding?=STRICT?
		public Assignment getFoldingAssignment_1() { return cFoldingAssignment_1; }
		
		//STRICT
		public RuleCall getFoldingSTRICTTerminalRuleCall_1_0() { return cFoldingSTRICTTerminalRuleCall_1_0; }
	}
	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.Content");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVsVSParserRuleCall_0_0 = (RuleCall)cVsAssignment_0.eContents().get(0);
		private final Assignment cHsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cHsHSParserRuleCall_1_0 = (RuleCall)cHsAssignment_1.eContents().get(0);
		private final Assignment cSimpleContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSimpleContentSimpleContentParserRuleCall_2_0 = (RuleCall)cSimpleContentAssignment_2.eContents().get(0);
		
		//Content:
		//	vs=VS? hs=HS? simpleContent=SimpleContent;
		@Override public ParserRule getRule() { return rule; }
		
		//vs=VS? hs=HS? simpleContent=SimpleContent
		public Group getGroup() { return cGroup; }
		
		//vs=VS?
		public Assignment getVsAssignment_0() { return cVsAssignment_0; }
		
		//VS
		public RuleCall getVsVSParserRuleCall_0_0() { return cVsVSParserRuleCall_0_0; }
		
		//hs=HS?
		public Assignment getHsAssignment_1() { return cHsAssignment_1; }
		
		//HS
		public RuleCall getHsHSParserRuleCall_1_0() { return cHsHSParserRuleCall_1_0; }
		
		//simpleContent=SimpleContent
		public Assignment getSimpleContentAssignment_2() { return cSimpleContentAssignment_2; }
		
		//SimpleContent
		public RuleCall getSimpleContentSimpleContentParserRuleCall_2_0() { return cSimpleContentSimpleContentParserRuleCall_2_0; }
	}
	public class SimpleContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.SimpleContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFrameParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTextualParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SimpleContent:
		//	Frame | Textual;
		@Override public ParserRule getRule() { return rule; }
		
		//Frame | Textual
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Frame
		public RuleCall getFrameParserRuleCall_0() { return cFrameParserRuleCall_0; }
		
		//Textual
		public RuleCall getTextualParserRuleCall_1() { return cTextualParserRuleCall_1; }
	}
	public class TextualElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.Textual");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextTEXTTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//Textual:
		//	text=TEXT;
		@Override public ParserRule getRule() { return rule; }
		
		//text=TEXT
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//TEXT
		public RuleCall getTextTEXTTerminalRuleCall_0() { return cTextTEXTTerminalRuleCall_0; }
	}
	public class FrameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.Frame");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGBParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLABParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRJBParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Frame:
		//	GB | LAB | RJB;
		@Override public ParserRule getRule() { return rule; }
		
		//GB | LAB | RJB
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GB
		public RuleCall getGBParserRuleCall_0() { return cGBParserRuleCall_0; }
		
		//LAB
		public RuleCall getLABParserRuleCall_1() { return cLABParserRuleCall_1; }
		
		//RJB
		public RuleCall getRJBParserRuleCall_2() { return cRJBParserRuleCall_2; }
	}
	public class VSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.VS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cVSTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cSpcAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpcINTTerminalRuleCall_1_0 = (RuleCall)cSpcAssignment_1.eContents().get(0);
		private final Assignment cMoreAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cMorePlusSignKeyword_2_0 = (Keyword)cMoreAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VS:
		//	VST spc=INT more?="+"? '>';
		@Override public ParserRule getRule() { return rule; }
		
		//VST spc=INT more?="+"? '>'
		public Group getGroup() { return cGroup; }
		
		//VST
		public RuleCall getVSTTerminalRuleCall_0() { return cVSTTerminalRuleCall_0; }
		
		//spc=INT
		public Assignment getSpcAssignment_1() { return cSpcAssignment_1; }
		
		//INT
		public RuleCall getSpcINTTerminalRuleCall_1_0() { return cSpcINTTerminalRuleCall_1_0; }
		
		//more?="+"?
		public Assignment getMoreAssignment_2() { return cMoreAssignment_2; }
		
		//"+"
		public Keyword getMorePlusSignKeyword_2_0() { return cMorePlusSignKeyword_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class HSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.HS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cHSTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cSpcAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpcINTTerminalRuleCall_1_0 = (RuleCall)cSpcAssignment_1.eContents().get(0);
		private final Assignment cMoreAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cMorePlusSignKeyword_2_0 = (Keyword)cMoreAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//HS:
		//	HST spc=INT more?="+"? '>';
		@Override public ParserRule getRule() { return rule; }
		
		//HST spc=INT more?="+"? '>'
		public Group getGroup() { return cGroup; }
		
		//HST
		public RuleCall getHSTTerminalRuleCall_0() { return cHSTTerminalRuleCall_0; }
		
		//spc=INT
		public Assignment getSpcAssignment_1() { return cSpcAssignment_1; }
		
		//INT
		public RuleCall getSpcINTTerminalRuleCall_1_0() { return cSpcINTTerminalRuleCall_1_0; }
		
		//more?="+"?
		public Assignment getMoreAssignment_2() { return cMoreAssignment_2; }
		
		//"+"
		public Keyword getMorePlusSignKeyword_2_0() { return cMorePlusSignKeyword_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class LABElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.LAB");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLABAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cLATerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cContentsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cContentsContentParserRuleCall_1_1_0 = (RuleCall)cContentsAssignment_1_1.eContents().get(0);
		private final RuleCall cENDLATerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		
		//LAB:
		//	{LAB} (LA contents+=Content* ENDLA);
		@Override public ParserRule getRule() { return rule; }
		
		//{LAB} (LA contents+=Content* ENDLA)
		public Group getGroup() { return cGroup; }
		
		//{LAB}
		public Action getLABAction_0() { return cLABAction_0; }
		
		//(LA contents+=Content* ENDLA)
		public Group getGroup_1() { return cGroup_1; }
		
		//LA
		public RuleCall getLATerminalRuleCall_1_0() { return cLATerminalRuleCall_1_0; }
		
		//contents+=Content*
		public Assignment getContentsAssignment_1_1() { return cContentsAssignment_1_1; }
		
		//Content
		public RuleCall getContentsContentParserRuleCall_1_1_0() { return cContentsContentParserRuleCall_1_1_0; }
		
		//ENDLA
		public RuleCall getENDLATerminalRuleCall_1_2() { return cENDLATerminalRuleCall_1_2; }
	}
	public class GBElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.GB");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGBAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cGRIDTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cColumnsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cColumnsINTTerminalRuleCall_1_1_0 = (RuleCall)cColumnsAssignment_1_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cContentsAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cContentsContentParserRuleCall_1_3_0 = (RuleCall)cContentsAssignment_1_3.eContents().get(0);
		private final RuleCall cENDGRIDTerminalRuleCall_1_4 = (RuleCall)cGroup_1.eContents().get(4);
		
		//GB:
		//	{GB} (GRID columns=INT '>' contents+=Content* ENDGRID);
		@Override public ParserRule getRule() { return rule; }
		
		//{GB} (GRID columns=INT '>' contents+=Content* ENDGRID)
		public Group getGroup() { return cGroup; }
		
		//{GB}
		public Action getGBAction_0() { return cGBAction_0; }
		
		//(GRID columns=INT '>' contents+=Content* ENDGRID)
		public Group getGroup_1() { return cGroup_1; }
		
		//GRID
		public RuleCall getGRIDTerminalRuleCall_1_0() { return cGRIDTerminalRuleCall_1_0; }
		
		//columns=INT
		public Assignment getColumnsAssignment_1_1() { return cColumnsAssignment_1_1; }
		
		//INT
		public RuleCall getColumnsINTTerminalRuleCall_1_1_0() { return cColumnsINTTerminalRuleCall_1_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_1_2() { return cGreaterThanSignKeyword_1_2; }
		
		//contents+=Content*
		public Assignment getContentsAssignment_1_3() { return cContentsAssignment_1_3; }
		
		//Content
		public RuleCall getContentsContentParserRuleCall_1_3_0() { return cContentsContentParserRuleCall_1_3_0; }
		
		//ENDGRID
		public RuleCall getENDGRIDTerminalRuleCall_1_4() { return cENDGRIDTerminalRuleCall_1_4; }
	}
	public class RJBElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.RJB");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRJBAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cRJTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cContentsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cContentsContentParserRuleCall_1_1_0 = (RuleCall)cContentsAssignment_1_1.eContents().get(0);
		private final RuleCall cENDRJTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		
		//RJB:
		//	{RJB} (RJ contents+=Content* ENDRJ);
		@Override public ParserRule getRule() { return rule; }
		
		//{RJB} (RJ contents+=Content* ENDRJ)
		public Group getGroup() { return cGroup; }
		
		//{RJB}
		public Action getRJBAction_0() { return cRJBAction_0; }
		
		//(RJ contents+=Content* ENDRJ)
		public Group getGroup_1() { return cGroup_1; }
		
		//RJ
		public RuleCall getRJTerminalRuleCall_1_0() { return cRJTerminalRuleCall_1_0; }
		
		//contents+=Content*
		public Assignment getContentsAssignment_1_1() { return cContentsAssignment_1_1; }
		
		//Content
		public RuleCall getContentsContentParserRuleCall_1_1_0() { return cContentsContentParserRuleCall_1_1_0; }
		
		//ENDRJ
		public RuleCall getENDRJTerminalRuleCall_1_2() { return cENDRJTerminalRuleCall_1_2; }
	}
	
	
	private final DocumentElements pDocument;
	private final PaperElements pPaper;
	private final ContentElements pContent;
	private final SimpleContentElements pSimpleContent;
	private final TextualElements pTextual;
	private final FrameElements pFrame;
	private final VSElements pVS;
	private final HSElements pHS;
	private final LABElements pLAB;
	private final GBElements pGB;
	private final RJBElements pRJB;
	private final TerminalRule tVST;
	private final TerminalRule tHST;
	private final TerminalRule tLA;
	private final TerminalRule tENDLA;
	private final TerminalRule tPAGE;
	private final TerminalRule tENDPAGE;
	private final TerminalRule tGRID;
	private final TerminalRule tENDGRID;
	private final TerminalRule tRJ;
	private final TerminalRule tENDRJ;
	private final TerminalRule tSTRICT;
	private final TerminalRule tWS;
	private final TerminalRule tTEXT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PpdGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDocument = new DocumentElements();
		this.pPaper = new PaperElements();
		this.pContent = new ContentElements();
		this.pSimpleContent = new SimpleContentElements();
		this.pTextual = new TextualElements();
		this.pFrame = new FrameElements();
		this.pVS = new VSElements();
		this.pHS = new HSElements();
		this.pLAB = new LABElements();
		this.pGB = new GBElements();
		this.pRJB = new RJBElements();
		this.tVST = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.VST");
		this.tHST = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.HST");
		this.tLA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.LA");
		this.tENDLA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.ENDLA");
		this.tPAGE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.PAGE");
		this.tENDPAGE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.ENDPAGE");
		this.tGRID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.GRID");
		this.tENDGRID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.ENDGRID");
		this.tRJ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.RJ");
		this.tENDRJ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.ENDRJ");
		this.tSTRICT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.STRICT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.WS");
		this.tTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ppd.Ppd.TEXT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.ppd.Ppd".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Document:
	//	{Document} PAGE paper=Paper? '>' contents+=Content* ENDPAGE?;
	public DocumentElements getDocumentAccess() {
		return pDocument;
	}
	
	public ParserRule getDocumentRule() {
		return getDocumentAccess().getRule();
	}
	
	//Paper:
	//	width=INT folding?=STRICT?;
	public PaperElements getPaperAccess() {
		return pPaper;
	}
	
	public ParserRule getPaperRule() {
		return getPaperAccess().getRule();
	}
	
	//Content:
	//	vs=VS? hs=HS? simpleContent=SimpleContent;
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}
	
	//SimpleContent:
	//	Frame | Textual;
	public SimpleContentElements getSimpleContentAccess() {
		return pSimpleContent;
	}
	
	public ParserRule getSimpleContentRule() {
		return getSimpleContentAccess().getRule();
	}
	
	//Textual:
	//	text=TEXT;
	public TextualElements getTextualAccess() {
		return pTextual;
	}
	
	public ParserRule getTextualRule() {
		return getTextualAccess().getRule();
	}
	
	//Frame:
	//	GB | LAB | RJB;
	public FrameElements getFrameAccess() {
		return pFrame;
	}
	
	public ParserRule getFrameRule() {
		return getFrameAccess().getRule();
	}
	
	//VS:
	//	VST spc=INT more?="+"? '>';
	public VSElements getVSAccess() {
		return pVS;
	}
	
	public ParserRule getVSRule() {
		return getVSAccess().getRule();
	}
	
	//HS:
	//	HST spc=INT more?="+"? '>';
	public HSElements getHSAccess() {
		return pHS;
	}
	
	public ParserRule getHSRule() {
		return getHSAccess().getRule();
	}
	
	//LAB:
	//	{LAB} (LA contents+=Content* ENDLA);
	public LABElements getLABAccess() {
		return pLAB;
	}
	
	public ParserRule getLABRule() {
		return getLABAccess().getRule();
	}
	
	//GB:
	//	{GB} (GRID columns=INT '>' contents+=Content* ENDGRID);
	public GBElements getGBAccess() {
		return pGB;
	}
	
	public ParserRule getGBRule() {
		return getGBAccess().getRule();
	}
	
	//RJB:
	//	{RJB} (RJ contents+=Content* ENDRJ);
	public RJBElements getRJBAccess() {
		return pRJB;
	}
	
	public ParserRule getRJBRule() {
		return getRJBAccess().getRule();
	}
	
	//terminal VST:
	//	"<VS";
	public TerminalRule getVSTRule() {
		return tVST;
	}
	
	//terminal HST:
	//	"<HS";
	public TerminalRule getHSTRule() {
		return tHST;
	}
	
	//terminal LA:
	//	'<LA>';
	public TerminalRule getLARule() {
		return tLA;
	}
	
	//terminal ENDLA:
	//	'<LA/>';
	public TerminalRule getENDLARule() {
		return tENDLA;
	}
	
	//terminal PAGE:
	//	'<P';
	public TerminalRule getPAGERule() {
		return tPAGE;
	}
	
	//terminal ENDPAGE:
	//	'<P/>';
	public TerminalRule getENDPAGERule() {
		return tENDPAGE;
	}
	
	//terminal GRID:
	//	'<G';
	public TerminalRule getGRIDRule() {
		return tGRID;
	}
	
	//terminal ENDGRID:
	//	'<G/>';
	public TerminalRule getENDGRIDRule() {
		return tENDGRID;
	}
	
	//terminal RJ:
	//	'<RJ>';
	public TerminalRule getRJRule() {
		return tRJ;
	}
	
	//terminal ENDRJ:
	//	'<RJ/>';
	public TerminalRule getENDRJRule() {
		return tENDRJ;
	}
	
	//terminal STRICT:
	//	'STRICT';
	public TerminalRule getSTRICTRule() {
		return tSTRICT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal TEXT:
	//	'"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | "'" | '\\') | !('\\' | '"'))* '"';
	public TerminalRule getTEXTRule() {
		return tTEXT;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
