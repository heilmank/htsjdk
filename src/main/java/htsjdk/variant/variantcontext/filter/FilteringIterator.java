/*
 * The MIT License
 *
 * Copyright (c) 2016 The Broad Institute
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */


package htsjdk.variant.variantcontext.filter;

import htsjdk.variant.variantcontext.VariantContext;

import java.util.Iterator;

/**
 * A filtering iterator for VariantContexts that takes a base iterator and a VariantContextFilter.
 *
 * The iterator returns all the variantcontexts for which the filter's function "test" returns true (and only those)
 *
 * @author Yossi Farjoun
 *
 * @deprecated  since 2/29/16 use {@link FilteringVariantContextIterator} instead
 */

@Deprecated
public class FilteringIterator extends FilteringVariantContextIterator{
    public FilteringIterator(final Iterator<VariantContext> iterator, final VariantContextFilter filter) {
        super(iterator, filter);
    }
}
