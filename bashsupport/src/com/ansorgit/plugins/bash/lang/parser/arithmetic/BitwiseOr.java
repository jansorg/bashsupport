/*
 * Copyright 2010 Joachim Ansorg, mail@ansorg-it.com
 * File: BitwiseOr.java, Class: BitwiseOr
 * Last modified: 2010-03-24
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

package com.ansorgit.plugins.bash.lang.parser.arithmetic;

/**
 * Parsing of bitwise or expressions.
 * <p/>
 * User: jansorg
 * Date: Feb 6, 2010
 * Time: 4:29:05 PM
 */
class BitwiseOr extends AbstractRepeatedExpr {
    BitwiseOr() {
        super(ParenExpr.delegate(new BitwiseXor()), PIPE, ARITH_BIT_OR_ELEMENT);
    }
}