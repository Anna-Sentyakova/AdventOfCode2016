package advent2017;

public class AoC2017Day9Part2 {
    private static String input;
    private static int pos;

    public static void main(String[] args) {
        int result;

        result = test("{<a>,<a>,<a>,<a>}");
        assert result == 4 : "unexpected result is " + result;

        result = test("{{<ab>},{<ab>},{<ab>},{<ab>}}");
        assert result == 8 : "unexpected result is " + result;

        result = test("{{<!!>},{<!!>},{<!!>},{<!!>}}");
        assert result == 0 : "unexpected result is " + result;

        result = test("{{<a!>},{<a!>},{<a!>},{<ab>}}");
        assert result == 17 : "unexpected result is " + result;

        result = test("{{{{{{<!>!>,<o!>},<a,\"i!!!>i!!,!>,<<e<i<<>,{{{<!>},<!><!>,<!!!>!!!>!!!>{\"!>},<!!!<!>},<oi!>!,'>}}}},{{<{!!!>},<!!,!!!>!!!>!!e!a!!!!<!>},<!!!>u!>,<!>!!u!!!!!>},<!>!>,<{>}},{<\"a!!!!'!>},<!}\"!>!!<o}i!<>,<<e,<eo!a}!!\"!>,<!>!>!>,<e{\"e\">}},{{<!oi'<!o!>ue>,{<!>},<i!>,<i>,{<'>}}}},{{<\"a,!>},<!!e!>,<e!!}!!o!!!>,<',}>,{{<i!!!!o!!!>!}!!!!!>!a!!!>!>!!a!!!!,!!u!!!>,<>}}}},{{{<{i!!<!!!!e!>>}},{{<!!!>},<ei>,{}}}}}},{{{<eaieia,!{io\"{!!}eu!{{!!e'>,{<>}}},{{{{<o>},<e!!o,!>},<\"u{!>,<!>},<a{}{!u>}},{{{<!!u'ioi''!>},<\"u>},<'oa!!<,'!!\"!!!!!>!!!!!>{!!!!aa>},{{<u}\",!!i!!!>!>!!!>!>!!!>'}!o{!!{>}},{<oiau>,<!!!>!><!>!!<!!!>!!<i!a}!>},<<}a}>}},{<eeo!!}!!!>e!>,<!!!>!!<{!!<i{!>i!>,<>}},{{{},{<!!!!!>},<\"!!!>!>},<o{!>,<,ea>}},{{<},\"a\"oeie!>},<ie'!!oa!!<>}},{}}},{{{}},{{<}e<i!!!!io!>},<\"!!e\"<\">},{{<'!!{!>},<a\">}},{<u!!i!!o{>}},{{<\"oe!!!>\"o{>},{{},<!>,<!!,!}!>!!!!!>>},{}},{{{{<!!{,,}!>!>,<!>},<!{a!<e'!>,<>}},{}},{{{<!!o\"'!!!>\"i{''>},{{},{{<!!!>},<\"}<\",!>>,{{},{{}}}}}}}},{{<u}\"!!!!!!o!!\"!>,<!>,<eiu!!!>,<o>},{<!!<!!e>,<e,<<<u!'>}}}}},{{{{{{}},{}},{{{<!!!>\"!!!!oa!>},<{a<}>,<'i\"a!!!>>},{<\"!\"ea!}e!!!>!>},<}o{>,{<e!>,<!!}\"i!!,!>ie!{{!>},<!>},<'!>},<e!!!>!!!>\">}}},{{},{}},{{{<i!>},<}!>},<{!ae!>,<!>,<!>,<!!!>'i!!>},{}},{<{!!!>!!!>a,!!!}!!!!}!>,}e}<{!!'!!!>!>},<>,<!>,<!>\"\"e<!!u<!!,e>}}}},{{{{{},{<!!o}!>,!>!!!>>},{{{{<,>}},<\",\"!>},<!!!!!!!>!>!i!>,<{!!!>}!>,<!!!>{ou>}}},{{{<!!e<!'>},<!a!>!u!!!>!>,<!!!!!!!>{\"<<!><!!!!u!!!!u>},{<!!!i!!!!!>uo!!!>,<a<>}},{},{{{{<!\"{}!!!>{a{i{a!>,<!!!>'>},<\"{!!!>}!a!!!<!>,<>}},{{{<>},{<!!!>!,{{>,<{!!!>u!oi!\"{''oo!!!o,i}ao,e>},{{<<!!<!>},<!!!,>},<o!>,<}!!!>!e}o!>},<<>}},{}},{{{},<!!!>{!>},<!!!>i!e\"!!!>!!\",!>},<uuo!>},<'!!>},{{<>}}}}},{{{<{\"!>\"!!e!\"}<a!>>,{}},{<ui!>},<e!>!!!}u!<!>,<,{!!o!!!>!>,<!,>},{{{<a!!a!{!!!!u\"!!a,!!o!>,<}u\">}},{{}},{<!>},<!!!<}a!>,<u!!!>\",!!!>\"\"!!ee,!>},<!>},<u>,<,'<u!!!>!!<!!!!\"!!!!!>aa!!>}}},{{{}},{{<a!>!>!>,<>},{<}a{i<!!!>},<'!>,<\"e{!>,!!u,!!!!!>>,<!a,!>!}!o>},{{{<u!!uo\"!>,<a\",!!!>\">},{<,eoe>}}}},{{<!!!!!>!>},<ue!!!>,,!>u!!!>e'<!!!>!>,<ae!>>,<!!i}!>,<<'i'!!!>a!!u!!!>>},{<,ui{>}},{{{{}},{<{!!!>,<a{}!>o\">,<!!!!!uu\"a}'io!>},<!>\"}e!>},<>}},{},{}}},{{},{<>,{<'{u!>!!!>},<{!!!!!>i\"!!>}},{<!!i!!''!>!!!>!!!!!>!!u>}},{}},{{{<,!>!!!>!>,<a{a!!}!!u,'!>,<}!>},<<!!>,{{{<i!>},<,!!!>>}},<>}},{<<\"a!!\"!>,<!iuao!>!!!>u>,{<i'!!!!<,i!oiea!!!>>}},{{}}},{{{{<,!>,<!>,<ua,u!!{{!>,<!!,ui,!>},<io>},<!o!!!!!!!!!!!!\"uuu\"<{!!!>}>},{{<!!!!!>i>},{<e\"<'!!\"\"e!>,<!\">}}},{{{{},{<!>>,<a!>},<\"!!!>!>e{e<\"<!>,<eu!!!>,!!!>!!i>}},{<}}!!!>!>!!}e!>,<!!!>,<\"}!!e}{>,{<}u>,<u!eeo!>,<au!!!>e,>}}},{{{{},{{{<e,!>}!>o!,<!>},<}!>,<!>e!!aa<\",!!'>}},<{'i!>!!!!u{}!!!>},<u!!!!}>}},{{<i!!!>,<'!{\"!<a!!'!!u!!o!o<!!!>{!!!!ei!>>}}},{{{<aea!!!!{!>!!i!!!!!!!a<}\"i}!>},<iu,a>}},{{<u\"!!<!>a<>}},{<!!!!u{}!>},<!u}u<!>,<oe{!!!>!u}u>,{<\"!!iu!!!>}>}}},{{<{i<<!{\"!i{\"!>,<!!ou>,<oo!>{>},{},{{<e!!{!iaui!!e!!!>>},{<!>,<!>i!!{'u<\"\"u!>o\"{}!i!>}!!,>}}}},{{<{u!!!!!>\"{!>!!!!!>!!!i!>aue{,<,>}},{{{{}}},{<!>,e\"},i!>},<!!oe!!\"a<>,{<\"!!}!>,<u!!!>o!!!!\"!!u<!>{!>,<!<i!!\"!!\">}},{{{{<i<!\"!!\"!!!><i<!><\"!u!>},<a<!i!!!>,<!a!!!>>},{<i{!!!>a<u>}},<!>}o}!>a!!},!!!>!>}!!!>,<>},{<{!>,<i'u!!o}!auiou,!!}!>>}}}},{{{<<!!!>!!!>,<!!!>},<!>,<i>}},{<!>,<!>,<!!!!eu}!>},<!!}!!}>,{<{!!!!!>},<!!!!!!!!!>{!>,<},\">}},{<uu!!}e{!i!>},<>,<}!!o!>!!!>a!!!>!{<'a!>,e!!!>u>}},{{},{{{<>},{<!!!!\"o!>e!!>}}},{{{<!!!>a!!!>'!!a!!{u!!!a>}},<!>},<!>,<u!!,'\"!>!!!>},<>}}},{{{<!!>}}},{{<!!!!!>o!!!>o!!!!eu{\"}!o,e}>}}},{{{{<<!!!!{{!>},<!>,<e\"!!!!!>>}},{{<!}!>},<!!!>,<!!!>>},{{<!!i<>},{{<,\"!>},<>}}}},{{{<!}a!i'!!'i!>>,{{<eii!>},<!>},<!>},<,u<<!>,<ei!u!!!>},<!!a>},<,{!!!!!>,<!!'>}},<!>>},{{{<,!>!>ou!!u!>,<i}'u!!!!i\"!>,<i!>,<{!!>},<!!u\"}}'i!>},<o'!}!!!>e'u!>io!,>},{<!>!!}!>},<!!!>!>},<!>!>,<'!>,<i!>>}},{{}}},{{{<!!!>,<}'{!i}!>\"!!u\"a,a!!!><>}}}},{{{<u!!}\"\"e!ee,{!!,>,<,,!>},<>},{},{{<uo!>>},<!>,<eo'!>},<a!>,<!<ou!!!>,<,<>}},{{{{{<!<!!!>!!!>\"!\"a!>,<!!,!!!>!>},<u{!!i!>},<!eu>}}}}},{{{{},{{<!>,<!>},<{!!!>i!>},<>},{}}},<,uu>},{}}},{{{},{}},{{{<\"a!>,<<{!>!>},<'!>!>,<<!>,<}'!>!>,<>},{{<o,a!!!>}!!!>>}},{{<eoi!>!>!!!>},<!!!>!!!>}}!ee!!!>!!!>,<!\"!!u!!!>>}}},{{{{<!>,<\"!!{'}!!!!!>'!\"\"!!!>!>u!!o}!>},<>}}},{<!>,<>,{}}},{{<o'<>,{<!>,<!!!>!!}i,!!ai!>},<oo!}!>},<!!>}},{<{!>,<a>,<u!!>}},{{{{}}},{{{}},{<'!>ai,!>},<!!!!!{!>oei!!!>\"!>,<'!>},<o>,{<!>,<i,!!<!>,<!>'!!!!!!!>!!e,!!}o<>}}}}},{{{{<!!!!!!{!>,<!!!>,<}!>,<a!>}!>},<!!!>i!>,<'i>}},{<!!<!>{e'i!!o!!<u>}},{{{<!!a!!'ea!>},<}{a!!!>,<e!>,<!!!>'!!!>u\">},<!>e!>},<u!>,<!i!>!!<\"!!!>,<{u!>,<!!\"\",u>},{<\"}',!ui,!!!!!>>},{}},{{{<e!>,<'!!!>!>,<!!!>},<,eu,>}},{<{\"!>'\"!>,<}!>,<,!!!>}o!!a!>ei'o>,{{}}},{{<!><<}!\",<i!'<!!>},{{},{<!>!>},<!!!>},<>}},{{<<u}!>},<<!\",'\"\">},{<{!!!!,!>!>},<o!!}a,!>},<'o<o!>},<!>,<>}}}}},{{{},<,!,!>},<!\"o!!!>>},{},{{<!>,<!'!!'i!!,o'!!!>,\">}}}},{{{{<<,!!!!!!!!!>},<!!!>!!<!\"a!!!>,'!!!!a!>,<>}},{<!>},<!>,<!!}!!{\"u<{o!>},<!!o,>}},{{},{{{<!>,{!!!'>},{{<\"!>},<!'!{!u>},{<!}o!!!>eai!u}!>},<!>},<<,ae>}}},{<!>,<<!>,<>}},{{<}!'!!o!!!>a'!!!>!>,<\"!!!!!!\"!!!>},<!!!!!!!>>,{}},{<!>!><{>}}},{{{<}!!,\">}}}},{{{},{{{{{{<\"i!>},<',!>\"'!>\"{!!\"!>e!>u>},{<'}>}},{{<,i{>},{<{!aa}u!!!>!!!!ia'!>,<!!\">}}},{<\"!\">}},{},{{<!!!><{o!,'}a!!u!>},<}\"{<>},{<a!{i!>!}!!'ea!>,<!!!!!>!!!><i<!!!>},<!>},<>}}},{{{},{{<!>},<!{e!!!!}\"a!!o!!<o,!!!>!>},<>},<>}},{{}},{{<!!,a,}!!a!!!!!!'!\"a!!!!!\"au>,{<<!!!>!!!!!><!>,<a!!u!!!>!!e!!!!',{{o!>>}}}},{{{{<!!!!!>,!!!>,<!>},<!!<!!!!!!,!!>}},{{{<<!!!>\"u<!!!!,!>,<!!,>,<!!a!>,<>},{<!>uou!>>}},{<\",!!!>,!>>,<a'ia!>},<!,{!!!i!>},<>},{<},!>},<!!!>}!>},<!!!>!>,<o!!ou}>}}},{<>,<''!>,<oi\"!!!>},<<i{{!{e>}}},{{{}}}},{{{{<a,i!>,<a!>},<>,{{<!>!!!>}!oe!<uei'},!!!>},<!!!>u>},{{<!{!>e<>}}}},{},{{{},<!!,}!!!!!>,<i!>u}e}!!u\">},{{{<}o'!>',<!>!>},<{,''>},{{<oe}{u<!>!>>}}},{<!!!>!!!iaiu<!!\"!>,<'!>},<u!!a\">}}}},{},{{<{!,i!!!>,\"i!!<\"!!i<!!!>!>,<>},{{},<{!>,<!!!>u!!!!!>!!}uo!!!!a!>,<{\">},{<>,{<<\"\"oa!>},<}ao{i!a!!!>\">}}}},{{{},{<!!<oa!!\"}!>,<!>!!i!!!!!>,<!>},<!!e!>},<o>}},{{{},<!!!!!>!!u>}}},{{<!>!>},<!!!>\">,{{<!o!'\"!!!!'u!!!>,<\"o}>},<\">}},{{<i<!>},<!'a!!!>!>!>>},<!\"},}i}!!!>>},{{{<i!>}a<>}}}}},{{{{}}},{{<'!>,<!!\"!>,<!!}!!'!!eui!>},<}>},{{{{<\"!>o'e,eu!!i!!!!{!!o!>>}},{<>}},{<{!<!!{u!>},<>}}},{{{{<>},<!!!>uee!<!!>},{{<!!!>iu}!>>}}},{}}},{{{}},{{{{},{},{<o<!>'ea}>,<!>o,a'!>,<u\"i{e}o{>}},{<''{<!!}!!{i<oa>,<!!,\"iio{}>}},{<!>,<{oi!>},<e!!!>uaa!>},<!!!>u!!>,<a>},{}}},{{{{{}}},{<<!>},<,e!>,<{<a>}},{{{{}},{{},<!>!!!>!>!!!>{!>,<!!!>,<a,{{!!!>,<'!>!!{>}}},{{},{{}}},{{{<\"!a!>,<!>},<,io!!!>!>,<u'!>,<!!!>!!!>},<!}!!!>>},{{<!>,<!>,<'u!!!>,u!i!!\"!!!>\"!!\">}}},{<!!!>!!!>!>},<<>}}}}},{{{{{<'au!>,<!!!>},<!>>}},{<u{!e!,u!!a!e!>,<{ii!>},<!!!>!!>,<!}!!!>{'aou{!>},<o\">}},{{{<!!!>>},<\"!>>}},{{<uo!>!!!e>,<!>!!}!>},<o>},{{},{<o>,{{<!!!>},<<au>},{}}}}},{{{<\"!>!!u!>}i!!!>ua!>},<!!o,e!>},<a,u!>>},<,o!!!>},<!>,<!!i>},{<!>,<!''a!!<<o,!>},<{'!>>,{}}}},{{{{<o!>a!>,<{>}},{}},{{<o}'!>ui!!}'e>,{}},{<\"!!i!!,a!!!!ui,>,{<,!>},<e>}},{{<oa!>!>,<\"\"o,\"oo>}}},{{{{},{}},{},{<!>{!>,<!!!>!!!e!>{e!!>,{<{!!!i{\"!>},<uu!>,<>}}},{{<!!{\"!>,<,!!'>}},{<!>},<\"o\"!>,<io\"!!!!,'>}}},{{<e!!!!{oia}'''}!!!>,<>,{<'>}},{{},<!!,!>},<<e!!!!!!!!!>!>,<ua!<a!!i{,!!{'o<>}}}},{{{<<<!!<!>!>,<}\">},{{{{<!>'{>}}}},{{<,e<>},{<i>}}},{{{{<a}}!>},<o,!>!>},<{!>u}!!!>{a<,!>'>,<o<<i>}}},{{{<o}\"!!,>,<!!!!!!<o>},<!ua!<<!>,<<!>},<!!oa{!>o!>,<!!!!!>\"\">},{{{}},<!u}a!!!!>}},{{{<>}}}},{{{{<!o}a!!!>\"!e!>\">},<!{!!!>!>!>,<!!{\"ie!u!!{>},{{{<!,!'!>,<!!!>},<\"!>},<>,{}},{{<>},<o!!a}!}a!>},<a!!!>!!i!>,<!>},<!>,<!>i>}},{{<{i<\"!!!>{!!aa!!!>!!!>ai!>'ui!{!!!>>,{<<!!!>,<}!!!>!>!!<!!!>{!!!>!iiu>}},{{<i!>},<a<\"!>,<aao}<!!!o!>'e>,<!!{\",!>,!>,<!>},<!>},<io\"u!!!>!>,<a{!>},<'>},{{<!'!!oa!>,<!!!><!!!>!!!!!>},<{<'!o},>},{<!u!>,<{<!>},<{}<!!ee!>,<u\">}},{<uu!o!>,<!,!>,<!u<>,{<'!>},<i'!>,<u\"!!!>!!\"\"'!!a!>!>ui'!>>}}}},{<{!>,<e<!!!>,<i!>>,{}}}},{<'!!!>,<>,<}i\"!>,<!!!!!>!!}!!\"!>},<!>!a!!iu\">},{}}},{{{{{{{<{eee!!!>}!>,<!!,!>'>}},{<!>},<u>}},{{<!!{!!{!e{}'!!<!!ui!>}!!'!!,o!>},<}o>,<!\"!>},<!!!>},<!!!>!{<!>},<!!!>,!u'u}o<>}}},{{<\"'}',!a!!!<!!!!!><!!!!!>,<!>},<!!}!>!!!!u{!au>,{{},{<,,!!!>,<\"!!>}}}},{{<ioe!>!!!>e!i,,>}}},{{{{{{<!!!>},<!!!>e!oa{}!>},<\"}!,,<!>,<e>}},{{<o>,{<!><<!!!>\">,{<!>,<!>,<'e{e!!!>!!!>},iu!!!>\"!i>}}},{{<,!!!>},<uo!!!>oa\"!a!oa!!!>>,<!!<i!u!>},<i\"!>,<\"e!>,<<!!,{a>}}},{{{<!!!>!>,<!>,<{!!!!!>i!>},<<\"!>!!!!>}}}},{},{{{{},{{{<!>'{'!!!>},<!!>},<!!}>},<!!''{{>},{{{{<<!<iue},u}!!!>!>},<!!!>''>}},<i!!!!!!\"!>!>,!!!!!>},<,\"}!e!!!!!>>},{{}}}}},{{{{{{}},<\"i}<!!!!o,\"}!>>},{{<'a!>},<!!e!>},<>,{<e!>,<!>i,!>},<'<!>},<!>>}},<,!>,<o!>,<>}}},{{},{}}},{}},{{{}},{{},<{<o!>!>i\"'!>!!!!<!>,<!<{!e\">}}},{{<\"!!>,{<!>},<u'!>}{!>},<}!!{!>,<!,>}},{<!o<a<}!!!>>,<!!!>i!o!!!!}\"!!!!u{!>},<'!>!<!>},<>},{{<!!o}!>},<o!{}!!i!!!>!>,<o!>,<!>},<{{a>}}},{{{<u!!o!!!>!!!a!i!>,<!>},<<!!!!<}!!ua!>>}}}},{{},{{},{<i\",}>}}},{{{{<,!!!>!!!!\"}!>},<!>,<!!{!>},<}>},<!>},<!>oeo,!!{o<e>},{{},{<!{!>},<!!!!!>i,>}},{{{{<a!>,<o{ii\"!!i',o!>,<>}},{}},{{{}},<!!!>!>,<!>,<{>}}},{{{},{{{{}},{<!!!'!<!>},<>}},{}}}},{<<!u!!!!!!!!!>!>!!!>!!eiu>,<!>,<<!>},<,!!!>'{'!!\"ao}u!!!>'o>}}},{{<u\"!>},<!!aae<!!!>!!!>},<'>,{<!!o,!>a!!!>,>}}}},{{{{<!>,<\">},{{{},{<>,<o,!\"iei!>!>},<}!!!>!!!!!!!>!>,<>}}},{<!!!>!!!eao!>!!!>i<{o!>,<!!!>},<e>}},{{},{{{}},{{{},{<!!!>!!!>!o!!eu!!<<e<>}},{{{<\"!!!>!>\"!e!>e\"!!eu!>},<e!>},<'>},<!>},<<oa!>{!>},<!!!!i\"i}}!!'<!!!>},<>}},{{{}}}},{{},{{{{<\"iu!!!aoo,!\">,<o!!!>!!<!>!>,<oi!ao!!!>!>,<!!!>,,>},{{<}!>},<!>!!!>},<i'!!!,\">}},{{<!!!>a!!{,!!!\"!>,<\"i<iui!!!>!!!a}!''>}}},{},{{{{},{<iii!>!<,<!e!>}}\"o!!!!!>},<<}!!!>',>}},{<o{!>,<!>!u!>{!}!!e>}},{{<!>eo>}}}}},{{},{<e!>,<a!!!e{a!!e!>!i,'!!!>e\"aa!>,<>}}}},{{{},{{}}},{},{{}}},{}},{{{<!!!>!,u}!>uo!>},<,\"<!>},<a,!>},<>},{{}}},{{{},<<!>},<a{{!>,<e!!<!}{!!{!!!>},<'<>}},{{{},{{<a{o!!!!!>',,!\"!>eia!>},<!>,<{<,>},<e!>,<>},{{<!,>},{<a!!!>,<,'i!!!!,!!!>i!<!!!!<,!>},<,!>},<>}}},{{<!!i!>!!}o!>},<!!!>!!!>e,{!>},<ae!!'>,{{<!>},<>},<!!!>eea!!{!>},<!><!!!>!!!>,<>}},{<i{!!!>!>},<o,,iu!!!>!>,uee'>},{{<o!!<e!>i!!e!!!>>},<e\"io!>},<!a!>,<{!>},<!>e!>eu!!!!!!!!!>,<o!>},<'!!>}},{{{<!!!>'ooeaa!>,<{>}}}}},{{},{<!<{uo!!!!!{!>!uo!!o<ue\"!!ia,'>}}},{{{{<>}}},{{{{}},{{{<!\"!!<!!!>\">},{}},{{<a!!}u\"i!!!>},<<>}},{{}}}},{{{{{{{{<!!i\"!>},<u!!!a{i!!\">}}},{<!!!>o!!o<!<ui!>!!{o!!u{>}}},{{},{<,!!ueua,{o{!!!>,<<>}},{}},{{<>},<}'!>,<!!ui{o{!!!,!!,ue!!eu!!!>>}}}}},{{},{{{<eo!e!>!!!>!>!>,<i!!a!!!>},<!<!!e!!u,!>,<o,>,{<'!!!>,<<a!!!>,<!>},<o!!{}!!!!'!>,<o}<>}}},{{{<}!!,!!!!!>!>},<u{a!!{o,o>}},{{<>},{<!!i{!!!>!>u>}},{{},{{<,\"!!!>!!{>,<i!>},<<a>},{<!!!>u}'!!e!\"{''o>}},{<!u<oa!!<>,<uu>}}},{{{<}>,{<e!!!>!>},<!>,<!!!{}!!e!>>}},{<u,>},{<a!}\"!,!,!!!,uuiiu>,<!>,!>},<u{}<\"!>,<'!!'!>},<e\"}ui'>}},{{{{{{{<ua!>{iu!!',!>},<!e'e!>,<>}},{{<o!>,>}}}},{<!>!>,<!!!!}e>}}},{}},{{{<<!!<!>},<}{!!auo!!!!!><e!!e'<!!!<>},<!><a'}',eaei!>>},{{},{},{{{<!!euui!!!!!>},<'{oi>}},<o!!!>\"!>!>},<!><u!>,<u!>>}},{{},{{{}}},{{{<o{!u!!u!>,<!>},<!!!!!>!>,<!>},<i!>,<i!>>},<!>!>u!!a>}}}},{}}},{{{{<!>e}'\"oi!!!>a\"!>,<ooo!!}o>},{<'}>},{<\"!>},<<u,{{'ee'e>,<!!!>{!u!i!e!!uee!i!!a\"u{>}},{<{{!,!u!!,!!<\"!!{>,{}}}}},{{{{<e}!!!>!!!>,'!!,>},<>},{{{}}}}}},{{{<>},{<>,<e!>,<!!!>},<a!!'u!!!!>},{<{>}},{{{<eei!!}!>},<>,<,''e{!!{i!!'>},{{<!!!i'!!a!!!>!e}!>,<u!>,<{>}},{<!!!>},<!>!!,a!!'!!}e'!e!>},<!!i!!'u{u!>,<u>,{<,!!a,aoo!>!!,{!>},<i!!!>}!!,o!'>,<>}}},{{},<}u!!a>},{{{{{<'<a!>,<!>},<!>},<!!!!!!!!'},a!!>}}},{{<!}{!>o!'o!>,<!!!><!!ou!>!>},<!e!>!>,<>}}}}},{},{{{<!!!>o!>u!!!>!>>},<>},{{<,,>},<'{ao!i,!!!>e!ua\"{!\"!!!>>},{<\"!>},<a!!!>e\",'!!!>},<'oo!!!>!>>}}},{{{<o''},{!!!>>,{<{!!!!!>}!!!>a!<}!!ea!>!!>,{<!{!!!u!!a<!>,<,!>},<!>,<e!!a>}}}},{{{<oe}'\"e'\"a,!!!>i!!u,!i!i>},{{<!!!>}>},<a{!a!>},<!>,<!!}!>,<a!>a!>>}},{{},<!>,<>},{{<!!!ae!!!>i'o!!\"\">},{<\">}}},{{<!!ia!>},<}!!!>\"i!>!!!!u!!!>\"!{u'!!e'!!\"!!>,<oei!!!><<!!!!i'}i>},{<\"!>!>,<,!!>},{}},{{{{}}},{{},{<,!!!>u>}}}}},{{{{},<}!>ia,!>!>},<i{{}!>},<>},{{<>}}},{{<!!,!!!!!>'<!!ee!>},<,>},{}},{{{{{{<>},{<!>,<!!a>}},{{{<,o!!{!>\"i!>!<!!}{!!'!!\"<!>},<,>}}}}},{{<i}!>},<!>'!!e\"\">,{<},!!u!>,<!>,<\"'!!!>!>>}}},{{<!>!!!>!!!i!o!!{!!e!!\"u!iaa!>,<}o,}ao>}}},{{{<!!u{o>,<!}'o!!!>o}a!!}ui!!!!!>!>},<!>>},{<!!ao>,{<o>}}},{{{},{<!>},<!'!>},<,,!\"'!>,<>}},{{<\"!>},<!ou>,<o!'!,!>!{,!}e!!!u!}!o>},{<!<!!!>,<{{o<!>},<'>}},{{}}},{{}}},{{},{},{<{!!!>,<i!>},<'!!!!o!>},<o{!!!\"!!!>}!i>,{}}},{{<}!!!>},<!e'a>,{<!!!!\"ea{'i!}<<ui!!!!>}},{{<},!>},<!!!!!>,<'!!!!e!>!>,<\"<!>},<!>},<>,{<<}<>,{}}},{{},<!u,>}},{{<{<!!!>},<!>},<!!!><!>,<!eo,!>},<u,'!>,>},{<>}}}},{{},{{<a\"!!\"!>!!!>o!!!><'{'!!!!!!},i'\"uu>},{{{},<o>},<'<!!!>!!!i}!>}!!!>!>u!\"!!!!}!!!>!\"!>'!>,<>}},{{<i!!!!!>!e!!!!a'!!!!}o'}<!>,<e!,>,<!>,<<ooui!!,!!!!}!!<'o!>>},<o<!!<\"{!o!!a\"!!!!o{<<a!!!!a!!!!!>>}}},{}}},{{{}},{{{},{{<!!!>},<!>},<,!>},<!!!>{!!{i!>},<!>},<!''<!>,<>},<!>},<}!!!>u!i\"<!\"e!>},<>},{{<e''<o!!!>,}{!>},<e>},{{<!!!>>}}}}},{{{<!!o}uoei>},{{<,oi\"a>}}},{{<!!a<i!>{\"{e!>,<!>},<}<,e>}},{<!>,<i!!oio!>,<\"!,o!!!!'!!e',>}},{{<auie\"!!!>\"u{>,{<}!},}!>,<a!!!!!!e{!>!!,,e}<,{!>>,{}}}}},{{{{<\"!>},<\"a!>},<!>!!!!a}\"<}!!!>!!!!!!\"!!!!!>,>},<u>},{{<!!!>,<!{e}\"!!u!!!\"!!!!>}}},{{{<>},{<!!!>iu!!!!{!>},<>}},{{{<!>},<i>,{{<aa}i>}}},{<!!,o!!!>{!!!>,>,<<u!>,<<!!i<i!!!>ui,!!!!!>,<!>},<}!!!>>}},{{},{{{{},{<ii!>e!>e>}},{<!!{<{a!'{!>!o!>},<!!u}!!<{!{>,{<u!!{o>}},{{{{<!>},<!!!>i!!o!>},<!a}i<,a!>!>},<a!'!!!!!>'>}},{}}}},{{<!>},<!>},<!>},<!!\"{<\"!}i>},{{}}}}},{{{{},{<'ua<!!!!o!!!!}}}!>,<!!\"u>}},{{<!!!\"!!!!!!!>},<!!}!!i!>},<!a{!<a'i!!!e',!>,<>},{<{e!!!>!!!>},<{{>}},{{<}e!!}!!!>},<>,{<!!,>,{<>}}}}},{{{},<ao!!u{,oo'!!!!!>!!!>{'!!!>ia!>,<!u,!>},<>},{<!>,<i\"!!!>i>}},{{<!!a\"!!<,!'{!<\"o,>},<!!i!,}!>},<!!!!!!!!{>}},{{{<'u\"o!!!>a!!!>,<!!e{{{!>},<,!}!,{>,<!!!!}\"\"o!!!>!>},<!!!>!!!>a!>,<u!>},<o\"!!}ua!!>}},{},{<!>},<<{}!>{!o\"!>,<!!!!!>!>,<!>},<>}}}},{{{}},{{{<>,{{<}'i!!o}!!{!!!>}!!}<ea!>!>},<{>}}}},{{<u''{!>,<i!>!,!>},<{'o<!!!><!>!!!,>,{}}}}},{{{<!!\">}},{{<e\">,<},!!!!!>uo}}i!>,<!!!}o!>!!o!>,<,!!\">},{<!>,<e<\"{>}},{{<a!><!!!!i!>,<'u!!!>!,u{\"\"!!{}!!!>,<>,{{{{},{<'oea!e!!,oe!>},<o!!!!!'>}},<u!!u!!i}!>,<!!\"a'eu!>,<>},{}}},{<i!i{o!!<ueo{au!>!>},<!}o>}}}}},{{{},{{{{<!>},<,!!!>},<\"o!!!>a!!!>!!,!!!!!>e>,{<!>,<a{aa!!!!!>>}},{{{<>}},{{{},<!!!>{!!\"\"!>,<o!!,'e!>o!!!>!!i!>,<>}}},{{{<}ua!>},<!!!>},<!!!>ee}a>}},{<u,\",u'!>},<!>,<>}}},{{{}}},{{{<i!!!!!>e\">}},{{{{{}}},{{<i!!!>!{!!!>>}},{{{{<a{!!!>!!!!!!e!>,<\"!!!>},<!>,<i>},<o}'!>,<!>,<e>},{{<!!!>},u<u!!<!>,<i<,{',!ei!!,>},{<ea'!>},<!!!!!!\"e}{!!a,aee,!>,<>}}},{<!!!}'!}u<!>!!'u,aao!>{!>,<>,<'\"'!{!>!!u!!!>ia\"!!!>u!>},<oo>},{{{}}}}},{{<!>,<{!!!>},<!>},<\"}a!!!>!\">},<{!!}u}!!!>>}},{{<i}!!!'e!'!>},<a,{ao'}!!!>!>},<!>},<!>},<>},{<!!!>>}}}},{{{{},<!!!>,<!!!>{},!>},<!!<'<e}!!}!>,<!!!>u}{>},{{},{<>},{}},{{},{{},{}}}}},{{{},{{{},{{{<!>\"!>},!><u!<!>},<!i>},{<!!,u!>!>!i!>},<a>}},{{<'!>,<!>},<!i!!!!!>\"!>\"ou>},<!>!!!!!!!!ae!>,<'!>},<!!'o!>,<,!>},<{!>,<!>,!>},<>},{{<!!!>!!{<!}!>,<!>i\"!>!>,<oo>}}}},{{{<>},<'!>a>},{<!!u!><!!i!!!>>,{{{<!!!!!>!>,<!><{oe<e>},{<a!!!>ea{!>!>,<>}}}},{{<!>,o'!!i\"<\"!>,!>,<i!!>}}},{{{<!>!!>}}}},{{{<o!!!>!>,<a!!o!!!!i!!!!!>!!eu>}}},{{<!>},<!>!>},<}o}>},{{<}o,!e!!!>,<!>,<a!!<!!''a{!!''o>,{<a!!o}}}u!!!>>}},<\"\"u!>,<>},{}}},{{{{{{<<>},{<!!!!u'!>!!e}'\"!>!!!>i{!>},<>}},{}},<<u!!'i!!!>>}},{{{},{{<<!>!i<!!ei<e!>},<a'>},{<}}!>!!!>!{!<<{{e!!!>!!,e\"!!!!{,>}}},<{!!!><'>}},{{{{<!!ui!>o<a>},<i!>},<!!',a!>},<{!>,<!!ui!!ua!>},<>},{{<!>},<o{>,{<!>,<,!>>}},{<!'!!!>!>},<e!>,<{<'!'<!!i!><a!'!!}!!{!>},<>}},{{},{{{<!>},<i!>},<!>,<}!,!>!!<!>uu!!!!u!>},<!e!,u>},<e!aaooi!!!!!>o}!!!>!>,'i}>},<<}a>},{{<>},{}}}}},{{<}}<!!'{\"u,!>io<i!>,<>},{<!>'>}}},{{},{{{},{<a!>,<{'!!!!!>e<!!!!oe}!>},<>}},{{{<!!!><o{!!{!>\"u!>},<}u!!e>}}},{{{{{},<!!!!\"a'!u<!!<!!!>o!>o!!u{{>},{}},{<u,i!!!>,ai!o!>,<uii!>,<!!>,{<,u!!a!!!!uu<e!>},<<i>}},{<,!!{!!i<!!o>,<!>a!!''ue!!\"!>i,!}!>,<,a!<>}}}},{{<!!!!!!'!!!>!!\"u!>,<e'!>,<>,{}},{{<,,u\">},{{<!!e!>},<e!>},<}}o!>},<<>,{{{<!>,<!>,<\"!i!!!>a!!\"o<{>,{<!!!>ueo!\">}},{<eio!>},<!!!>!!!>>,{}}},{<!aa!!!>a!'}a!>e!!,!>,<>}}},<!!!<a!>,<o>}},{<}a!>,<!!!i!>},<!!!>\"<<>,{}}},{{<{{a\"!}{>},{{},{<!!!!!>!>!!!>i!>,<!>ea,>,{<!>,<\"i!>a\"!!<,,ii'>}}},{{<a!!!>\"e!!<!>},<i>,{{{},{{<'!>},<!!!>!!<,<!!eao,,'!>},<!>},<!>},<a\">}}}}},{<!!!>!>},<>}}}}},{{{{<i{'!ie!>},<!>},<a{!!>}},{<!>,<<\"!!}!!!{!!<<{!'e!!!<a!!!i!!!>!!!!!>>,{{<,!>},<a{!>ia!!\"o!!!!!>}>}}}},{{<\"!>,<a!!!u!!!>>,<!!!>!>,<{!{!!i!!!>,<!!'a!>,<\"i},!>!>,!!o>},{<!>},<{!!i!>,<,,!!!>,<!!!!'iao!!!>>},{<!>!>!a{'!!!>>,<a!>,<auu<>}},{{{{{},<!>!e!!!!ia}{!>},<{o!>,<!>,<{<\"e>},<>},{}},{{<i\"<o<!!\"!!!>},<!!!>,{!!e<!!!!}>},{<ai!>},<i!>},<u!e!>,<!>},<!>,<!>>}}},{{{{<'>}}},{<!!!>},<{e!!<ou!!!>!><o!>,<>,{{{},<\"!!!>!>},<\"a>},<!>}e}}!>!>o!>},<a{e{}>}},{{<>,{<,o{!\"!!!>eu!>},<\"a>}}}}},{{{{{<!!!!i!>},<o}o!>},<<!!!>u!!!>!'!!u'!>,<<!>},<u\">,{}},<}!!!!!>!!!><!!!\">},{<!o!>},<,!>},<}!!ia,!!!a!!\"!!'!!!>ea>,{{{<!>,<\"ea\"!!!>io!!!!!><!!!>},<>}}}},{<!'!!<\"!!!>},<o!!!>i,<e}}ei!!}!!!>,<}>,<<}o!>},<!>},<>}},{},{{},{{<!!!>!>},<eo!!{!>,!>,<e>,<!!}!>},<a!>,<!!!!!,!!<!!u>}},{{<{!>},<o{<{'>}}},{{{<oo\"!>,<>}},{<<!!uou<>,{}}}},{{},{{},{{<u{a!!'!>,<\"a},'<\"o>}}}}}},{{{{{<>},{<}!!a,}<!!<\"}u!!!>!!!>!>,<\"!!!>u!!!>>,<},!!!>oe!>},<{u!>,<'>}},{<!!e\"e{!!{<!!!>},<!e!>,<!>,<!>,<e\"!!!!>}},{{{{{<e!>},<!!!!!>,<!>},<o,}!{{'>,{{<!!uua!>>,<<iou,!>,<!!!>,o!>,<eo{!e<'!!!>>}}},{<!!!!!>,<!>,<>}},{{{<!!<ou!>},<!!!>,>},<}!!i!!!>!!!>},<!!iii!>>},{{{<a}eo''!o\"<!>},<>},{<iouii!>},<u!>},<}!!!><u'!!u!!!>,<u<>}},{{<!>,<!>,<>},<},!!!>ee!>},<!>},<!!>},{}}}},{{{<<''o!>,<}>,{{<!>!>},<!>>}}},{{{<{}!>},<!!a!>{a!!}<<'>},{}}},{{}}},{{{{},{{<!!!>{!!,},{>,{<!!'!!'!>,<ai!e!>,<!!!>>}}},{<!!!>o>}},{{<i!!a}u<!!eou!uo}!>,<!!\"!>,<i>}},{<a'!>},<!>,<!a!!!>!!!>u!!!>\"!!u>,{}}},{{<!!o!>},<a,}>,{<,!i!!!!!!uoi>}},{<>,{<}{,u!!<!!!!\"e'!i!o\"u>}}},{<>,{<!>,<ee}{{!!!>!>!!>}}}},{{}}}},{{<,o>,{<>}}},{{{{{{},{{{<!!\"i!!!>,<e}u>}},{<!>,<>}}},<<!>},<!!}!>},<u!'!>,<!,u>},{{},<\"!!!>,<i}!}!i!'!!!\"!!<!>!!!!}<!!>}},{},{<!!!>!>>,<!!!>{aa!!!!a!}e,\"!>,<}<<!!!a!>},<e<>}},{{},{}}}}}},{{},{{{{{{{<u,\"<e!!>}}},{<>}},<!>,<e!>,<!>},<!>},<a\"eaea!!oa}!!<>},{{<'!>,<!>},<!!ou!>},<<>}},{{<!!!>u!}!>},<au!\"!>!}>},{<i,<o!!!>u>}}}}},{{{{},{<}u\"i!!!>!!a!!u!!a{u'!!e<>},{{<>}}}},{{{{{}}},{<>,<!>{!i,}ie!!u!>,<o}!>,<!>,<>},{{{},{}},{<e'!!u\"ioi!!e!!o!!>}}},{{<\"}!!\"!!!>\"\"\"!>,<>,{<\"!!!>},<!'!!o!>},<{'a}!!a!!!>eo{!!!!!>!>,<,>}},{<a!!\"a{>,{}},{<!>,<i<\"!!u}<'iu>,<!>!>eo!!!>\",<!!o!!e>}},{{{{{<>}}},{<!!>,<!!,!!!>},<oo!>,<!,!!!>a!>>}},{<!>,<!>>}},{{{{},{<!!e!>!>!>!>},<u!>,<<!>,<!>,<!!!!!>!u>}},{{{{<,o!>a>,<!!!>,}!!i>},{<{>,<\"',e!!!>},<ie!!!>{!>},<!u!>,<}u!>},<a'>},{{},{<>,{}}}},{{<\"!>,<e!u!!o!>u!>},<>},{{{<{!>!!\"i!>,<<\"!>i!!\"a}}<!!!>\"i>}},{{<!!}<!>},<i!>,<u!>},<uo!!!!!!!>'<>,{{}}},{{}}},{<u!>},<}a>,{{<o<eiu!>},<!>\"u>}}}},{<o<o<<a!!u>,<<!>,<>}},{{{{<!\"!!!>o!a<}!>\">},{}},{{},{{<!!o\"!>!!!!{,{\"!!}'!!<!!!>,<>}}}}},{{{{},<!,!>!!!!i!!a}o!!u!!'!>,<{!,ouo,e>},{<!>},<!>,<!ua!!!!!>,<!!'e!>}!>!!!><>,{{<!{!e!!'!!!>o!!!>{<!!!>},<>},{<}{o!<!!!>,a!>!!!>>}}},{{<!'ae{!>},<>},<\"ou\"!>},<!!'{!!!>>}},{{<,>}},{<i!!!>!!!!!>},<!!o!!}<>}}},{{{<}o!!!>},<,}a!}e!!!>'>},{}},{<{\"{!!{!!,>},{{{<!!e,!!,a!>,<>,{}},{<!>},<a{\"ie'<ia!>>,{<!!!>,<\"e{!>,<!>,<e!<i!>,<<!>,<!!}>}},{<oa!!!!'!!!>e{<!!!e'<!!<!>},<!!u!>},<oa\"'o>,{}}},{}}},{{{<!>,<!!\"}oei!!'!>{<'{!!}e<!>},<!}>,<!!a!<<\"u!!a!>,<>},{{},{<!!}a>}},{{},{<a!!!>'!>},<!!!>!!!>u<{!u>},{{{}},{{},{{},{<<!>!>>}}}}}},{{{{<\"u!>},<!<!>>,{}}},{{<\"!>\",,>,{<!!!>'u!>'<{u!>u>}},{{<e!!i'i!!o,!!!>,<i!>,>}},{{{<!!!>!>,<!>},<u}'!!,{!!<!!!>!>,<!>>},{<{,\"!!\"'i>}}}},{{{{{},{<!ee!>i,<!>},<,>}},{}},{{<!!!!,!>>},{{<!!!u,!>,<!}ao{>},<!,!>o<e!>!>},<!'!>},<!!!>!>},<i{{!'>}},{<<\"oie!>},<!>!!u<oo,!!,o>,{}}},{<!!''!>'!!!>\"o,u}>},{{{{}},{{<!>},<oi!>},<<!!!>!!!<\"!>,<}!!!>>},{<!!!!a{>,{<{e!!!>'!!!>'!!e{ue'!!o!!!!!>!!!!!>!>,<<>}}}},{<{!!!>u!!!!u!!!!'>,<}{i!!,o\">},{<\"ea\"\"!>e}!>,<<a,!!!!!>},<\">}}},{{{{<>},{}}}}},{{{<u!!!>!!,!>},<''ue,>}},{<!>'{o!>!!!!!>!!\">,<<}o!o{!>},<ue>},{{<u!>}<!>,<!!!!!>>},<a!>},<{'o!!,,\"'<!e!!!>>}}},{}},{{{<a{!!!>!>},<{!!>}},{<!!,!<a\"!>!!!>},<!!,!!>,{}},{{{<!>},<e!!!!!>uu>}},{{{<,!!!>!!}\"!>},<{'!>!>a}!!a!!'a!>{>}},{{{{}},{{}}},<<!!ooa!'a!!o{>},{{<'>},<i,<!}'{\"!!!>e<!>},<e!!!>!!<<>}},{{<,e{!!!>a!!<!!,!>},<\"!!}iu!!}!>i<>}}}}}},{{{},{{{},{{{<oie>}}}}},{{<!!e!>\"!>i!!>,<e!!!>}io!!!>!>,<,<!>},<!>u!!!>>}}},{{{{<a<}'!>o'!>i!!a!,!!>}},<e!'>}},{{{{{{<,!>,<!\"!!<!!uo!i}!!''!>,<,'>}}}},{{<'u'!!'\"!aou{e}!!!>,<<>},<{a!>,<e!}<}!>},<!>'!o}>},{}},{{{<ao!!!>e>},{{<>},{}}},{{{}},<,!>,<>},{{{<\"'{i,'!!!>,<\"!>,<u!!!i!>,<!ioo!!!!!!!>!i>}},<a{,}!!!>!!<u{!!!>aui!!}>}}}},{{<!!!>\"!!{<>},{{<>},<\"!>},<{}{e<o}e!!\"\"au,'!>},<!!!>>},{{<!>},<},>},{<u!}a!>!>!!\"iu!!a\"u}>}}},{{{{<!>,<!>},<'a!>,<e!>>},{<!!<>,<!>,<!!!>,<oi'{,>}},{<{\"!<!\"!>},<!a'{!!u!>},<,u,!>,<!>},<!!}}>}}}}},{{{{<u<i!>},<!!!>}\"!>!!i\"e!!!!>}}}},{{{{<o'!>!!<!!<>},{<a!><!>,<!!<e<!!>}}},{{{{<'{i>}},{<e{{!i!!iea>}}},{{}}},{{{}},{{{{{{},{<!{'!>},<}!!!!e{!}<!>,<u}o!>i>}},<}{>}},{{<',!>},<!\"!>},<!!,<!,ee!>e!e}>}}},{{<'e!!'!>}}>,<!!'!>,<i!!e!!!>!}',!!u{iei!<!!>}},{{}},{{{{<!!e,{u!<}!!!'}a>},<{!>},<''i}{!u!!!>!>,<a>}}}}}},{{{{{{{<\"!!!!}u\"o!>},<u!!u!!!>!>},<!!}!>},<!!<e>}},{<e{!!!!o,!>!!!>},<!<!>,<<!>},<{!>},<>}}},{{<'e!!a'!>},<i}>}},{<u<i,>,<,o,}{!!\">}},{},{{{{{<!!!>>,{<!!,}e>}},{<!>},<!>!>},<},!!!!}i!!,!>},<!>ao!!e'<}>}},{{{<}>},<!!!!a!!!>u\">}}},{{<!>},<<ia>,<!>},<o!>!!!>},<oe!>},<a,i>},{}},{{{{},{{{<,'{'}!!!!e!!{>},{<,!a'a!,!!!>>}},<e{!!,\",e!!!!<i!>!!!>,<!!<!>}!!}'>},{<!!i!>,<,!e<!,a>,{<>}}},{{}},{{<>}}},{{<a>},{}},{{{{<\"i{}'!>},<{<i!>,<!>\"{!!!>!!oe{{o>}},{{},{<ae}!>!>!!!>!<}\"!>>}}}},{{{},{<<!>},<{>}},{<a}!}!>,<!!!>},<,{i>,<!a{!>,<!>,<},!!!!!!!>\"ua!!}>}}}}}},{{},{{{},{{{<i>},{<!!a!!'!!!>\"!!!>o{'!!u\"!!\"!!!!!!',>}},{<i}!{e!>},<!!eu!>,!!!>ea>,{}},{{{<,'{\"e,!>},<!o'<,i!!'!!{\"!!!>>},{<!>},<}{!>,<a!>},<!>o!'!>!<a!!!>!!!>{uo>}},<iou!!!>,<e},e\"i!!!>!}'!!{!u\"a>}},{{<ee!oeae}!!!>aue\"!>},<>,<e>},{<o!!o!!!>!!!!!>>},{{<!!!ui,}>}}}},{{{{<!<!!!>,<!>},<{i!!!>i>}},{{<'a}>},<{i\"!!a!a\"!!!!!>'!>,<<!!!!!>!>},<{>},{}},{{{<!!!!!>\"!>,<'!!}e\"a\"a!>,<!<u'!>},<\"}>,{<e!>},<!>!!\"\",!!<!!}e!!u>}},{{{<!>!!!>!>},<,!,!!<i\"{\"}<\"}!!!>!'!a!!<>}}},{{<aae!!!>,<'!<>},{}}},{{{{{<!>},<!!!>>}},{}}},{{<!u!!,!!!>ee<!!!!<!!{!>},<io!>,<>},{<}}iu!>},<e!!a,}<!>i!!!>!>!!>}}},{{{{}},{<a<e<!!!!!>,<!}!>},<!>},<u!!u!>{}'>}}},{{<u!!!ee'{\"e!>!>,<e!!'!!!>!>,<a!!,\",,!!,>,{<u''\"o!>!>!>oi{!!>}},{{<<i{>},{}},{{{}}}}},{{{},{{<'\"!!>},{<i>}},{{<!!!!!>'\"!!!>i'<oe!e!!iu'!!!!!!!>>}}}},{{{{<\"}!>i!!o!!!>u,!>!i!!!>ii>},<!!,!>,<oai!io!!i!>},<!!!<e<e!!\"!!!>,<>},{{<!>},<<!>},<!!i!!a!\"o!!e!>u!<!'!!!>,<<>},<e!u!!!>aiu<!>!>!!!!e!!!>,<!!'e!>!!>}},{{<!><!>,<!>},<!>},<,u<,}!>},<!!!!e,o'>,{{},{<a>}}},{}},{{{{<\",<!!\"o!>>},{<o\"!!<{}',!><>}},{<!!!>'i!!!>,<i>}}}}},{{{}},{}},{{{<a}ei{o!>,<!!!!ui!'!<{!>,<!>},<!>i>},{<<!!!>,<}}ao!>},<!!!>},<!!!>>}},{{{<!{u!!!!!>!}!!'\"!>,<<\"!>,<!!!>'>},{}},{{{<!,!eu!>'u!!{!!!>e}'o!e!!!!!>o>},{<\"!!!>}!<i!!!>!'!!!uooeo!a!\"!iio!!>}},<o!!!{e\"}!!!>!u!\"{,!>!>!>},<u!'>},{<!>},<a!a}!!!>{!i!!!!auo<i>}},{<\"'!>},<{e!!!>!!uu!>,<!!a>,{<o\"o!>},<!>,<!\"}\"o!{'{,!>},<>}}}},{{{<!!{\"\"\"!!,>},<!i<<>},{{<!!o\"!e>}},{{{<e}!!!}>}},{<<!!!>!>,<!>,<!u!!!!!!,u!!!!!!!!!!!>,<'!>\"!!!>{>}}}},{}}}");
        assert result == 7284 : "unexpected result is " + result;
        System.out.println(result);
    }

    public static int test(String s) {
        input = s;
        pos = 0;
        return readGroup();
    }

    private static int readGroup() {
        int weight = 0;
        assert input.charAt(pos) == '{';
        while (true) {
            ++pos;
            switch (input.charAt(pos)) {
                case '}':
                    return weight;
                case '<':
                    weight += readGarbage();
                    break;
                case '{':
                    weight += readGroup();
                    break;
            }
        }
    }

    private static int readGarbage() {
        int count = 0;
        assert input.charAt(pos) == '<';
        while (true) {
            ++pos;
            switch (input.charAt(pos)) {
                case '>':
                    return count;
                case '!':
                    ++pos;
                    break;
                default:
                    ++count;
                    break;
            }
        }
    }
}
