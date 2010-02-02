/*
 * Copyright 2009 Joachim Ansorg, mail@ansorg-it.com
 * File: BashRefactoringSupport.java, Class: BashRefactoringSupport
 * Last modified: 2010-01-31
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.refactoring;

import com.ansorgit.plugins.bash.lang.psi.api.function.BashFunctionDef;
import com.ansorgit.plugins.bash.lang.psi.api.heredoc.BashHereDocMarker;
import com.ansorgit.plugins.bash.lang.psi.api.vars.BashVar;
import com.ansorgit.plugins.bash.lang.psi.api.vars.BashVarDef;
import com.intellij.lang.refactoring.DefaultRefactoringSupportProvider;
import com.intellij.psi.PsiElement;

/**
 * Definition of the refactoring support available in this plugin.
 * <p/>
 * Date: 01.05.2009
 * Time: 10:41:12
 *
 * @author Joachim Ansorg
 */
public class BashRefactoringSupport extends DefaultRefactoringSupportProvider {
    @Override
    public boolean doInplaceRenameFor(PsiElement element, PsiElement context) {
        return (element instanceof BashVarDef) ||
                (element instanceof BashFunctionDef) ||
                (element instanceof BashVar) ||
                (element instanceof BashHereDocMarker);
    }
}
