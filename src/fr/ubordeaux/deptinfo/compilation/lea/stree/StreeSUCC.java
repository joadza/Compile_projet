package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.CJUMP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.CONST;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.JUMP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.LABEL;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.SEQ;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Stm;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.CJUMP.Op;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;
import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeSUCC extends Stree {

	public static final Boolean RIGHT = false;
	public static final Boolean LEFT = true;
	private Boolean rank;

	public StreeSUCC(Stree left, Boolean rank) throws TypeException, StreeException {
		super(left);
		this.rank = rank;
	}


}
