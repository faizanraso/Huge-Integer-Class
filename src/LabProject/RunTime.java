package LabProject;

import java.math.BigInteger;

public class RunTime {
	
	
	public static void main(String[] args) {

		BigInteger huge1;
		BigInteger huge2, huge3;
		String x = new String("");
		long startTime, endTime;
		double runTime = 0.0;
		int MAXRUN = 100;
		int MAXNUMINTS = 100;
		
		for (int numInts=0; numInts < MAXNUMINTS; numInts++){
			huge1 = new BigInteger("4802005815844740669135945255478726054448800971541474491529526544036676045271013078353837668820667031753166721890440909755158059046411714360725726986917827645524006725896333487996733082127513769136011849707334431803957022347296514251288130257855299458504804954983643270304727772995865276519199049415396491556692767280935853647075811800931197569703219458675712752685412578438425642989007279200073236077325677012859126233496942705174703418001641581178207213891304623376872942170428962888730517045554314086776981287132076385680524289310277798763376705908950496120848893716695076266092319429667475502761477953858867468336474757436977729516749084279606644591849821398288421247984675295952943268583684079773469440764229566393744239995779935242643390450689561204521461422691599162543561746597373713167996360765540953888287748287236671327847128432619319151230932966917339405198632944738624142159297440577473633173286190002376691359452554787260544488009715414744915295265440366760452710130783538376688206670317531667218904409097551580590464117143607257269869178276455240067258963334879967330821275137691360118497073344318039570223472965142512881302578552994585048049549836432703047277729958652765191990494153964915566927672809358536470758118009311975697032194586757127526854125784384256429890072792000732360773256770128591262334969427051747034180016415811782072138913046233768729421704289628887305170455543140867769812871320763856805242893102777987633767059089504961208488937166950762660923194296674755027614779538588674683364747574369777295167490842796066445918498213982884212479846752959529432685836840797734694407642295663937442399957799352426433904506895612045214614226915991625435617465973737131679963607655409538882877482872366713278471284326193191512309329669173394051986329447386241421592974405774736331732861900023727273356691359452554787260544488009715414744915295265440366760452710130783538376688206670317531667218904409097551580590464117143607257269869178276455240067258963334879967330821275137691360118497073344318039570223472965142512881302578552994585048049549836432703047277729958652765191990494153964915566927672809358536470758118009311975697032194586757127526854125784384256429890072792000732360773256770128591262334969427051747034180016415811782072138913046233768729421704289628887305170455543140867769812871320763856805242893102777987633767059089504961208488937166950762660923194296674755027614779538588674683364747574369777295167490842796066445918498213982884212479846752959529432685836840797734694407642295663937442399957799352426433904506895612045214614226915991625435617465973737131679963607655409538882877482872366713278471284326193191512309329669173394051986329447386241421592974405774736331732861900023727273358466051669135945255478726054448800971541474491529526544036676045271013078353837668820667031753166721890440909755158059046411714360725726986917827645524006725896333487996733082127513769136011849707334431803957022347296514251288130257855299458504804954983643270304727772995865276519199049415396491556692767280935853647075811800931197569703219458675712752685412578438425642989007279200073236077325677012859126233496942705174703418001641581178207213891304623376872942170428962888730517045554314086776981287132076385680524289310277798763376705908950496120848893716695076266092319429667475502761477953858867468336474757436977729516749084279606644591849821398288421247984675295952943268583684079773469440764229566393744239995779935242643390450689561204521461422691599162543561746597373713167996360765540953888287748287236671327847128432619319151230932966917339405198632944738624142159297440577473633173286190002372727336691359452554787260544488009715414744915295265440366760452710130783538376688206670317531667218904409097551580590464117143607257269869178276455240067258963334879967330821275137691360118497073344318039570223472965142512881302578552994585048049549836432703047277729958652765191990494153964915566927672809358536470758118009311975697032194586757127526854125784384256429890072792000732360773256770128591262334969427051747034180016415811782072138913046233768729421704289628887305170455543140867769812871320763856805242893102777987633767059089504961208488937166950762660923194296674755027614779538588674683364747574369777295167490842796066445918498213982884212479846752959529432685836840797734694407642295663937442399957799352426433904506895612045214614226915991625435617465973737131679963607655409538882877482872366713278471284326193191512309329669173394051986329447386241421592974405774736331732861900023727273358466051364784164404323705873720776057127120673664678261259212712223751812760121685675245701861584660513647841644043237058737207760571271206736646782612592127122237518127601216856752457018613647841644043237058737207760571271206736646782612592127122237518127601216856752457018618466051364784164404323705873720776057127120673664678261259212712223751812760121685675245701861272733584660513647841644043237058737207760571271206736646782612592127122237518127601216856752457018610794299624611540821555766860919317740699757111480200581584474007942996246115408215557668609193177406997571115085848702084504173185796302959451592548558882552304385165495606591464218589054119760119647765337229689677378971180690232950260649956123854798575279679531097498050726737042498849967088290333192445659517444059648666737680940165783760535244399332876534688831729877358728934183326473133405345972142750182384108649833290693053073319171350565175148247520524962938216892844590686255335380979002400476560937417099120092776837279320346652675368418473354681949646257130858700000554251017779679946665835165543287073714598082528067538562952612742774933036012891989609518022015373115254723290241444930005788166329013904667930304336964563775936344727685400426672570865053351565984101443955016396955121168497312543239022489052596264210987702493136909290974609776066327079632677825724812915946856160822251943614452099474336977201367313372344258738233182557237876318263010634327471281394802005815844740079429962461154082155576686091931774069975711150858487020845041731857963029594515925485588825523043851654956065914642185890541197601196477653372296896773789711806902329502606499561238547985752796795310974980507267370424988499670882903331924456595174440596486667376809401657837605352443993328765346888317298773587289341833264731334053459721427501823841086498332906930530733191713505651751482475205249629382168928445906862553353809790024004765609374170991200927768372793203466526753684184733546819496462571308587000005542510177796799466658351655432870737145980825280675385629526127427749330360128919896095180220153731152547232902414449300057881663290139046679303043369645637759363447276854004266725708650533515659841014439550163969551211684973125432390224890525962642109877024931369092909746097760663270796326778257248129159468561608222519436144520994743369772013673133723442587382331825572378763182630106343248020058158447400794299624611540821555766860919317740699757111508584870208450417318579630295945159254855888255230438516549560659146421858905411976011964776533722968967737897118069023295026064995612385479857527967953109749805072673704249884996708829033319244565951744405964866673768094016578376053524439933287653468883172987735872893418332647313340534597214275018238410864983329069305307331917135056517514824752052496293821689284459068625533538097900240047656093741709912009277683727932034665267536841847335468194964625713085870000055425101777967994666583516554328707371459808252806753856295261274277493303601289198960951802201537311525472329024144493000578816632901390466793030433696456377593634472768540042667257086505335156598410144395501639695512116849731254323902248905259626421098770249313690929097460977606632707963267782572481291594685616082225194361445209947433697720136731337234425873823480200581584474007942996246115408215557668609193177406997571115085848702084504173185796302959451592548558882552304385165495606591464218589054119760119647765337229689677378971180690232950260649956123854798575279679531097498050726737042498849967088290333192445659517444059648666737680940165783760535244399332876534688831729877358728934183326473133405345972142750182384108649833290693053073319171350565175148247520524962938216892844590686255335380979002400476560937417099120092776837279320346652675368418473354681949646257130858700000554251017779679946665835165543287073714598082528067538562952612742774933036012891989609518022015373115254723290241444930005788166329013904667930304336964563775936344727685400426672570865053351565984101443955016396955121168497312543239022489052596264210987702493136909290974609776066327079632677825724812915946856160822251943614452099474336977201367313372344258738233182557237876318263010634327471281397724412785233468945898047984846811935681841694774234214112349343495031825572378763182630106343274712813977244127852334689458980479848468119356818416947742342141123493434950747128139772441278523346894589804798484681193568184169477423421411234934349507724412785233468945898047984846811935681841694774234214112349343495050858487020845041731857963029594515925485588825523043851654956065914642185890541197601196477653372296896773789711806902329502606499561238547985752796795310974980507267370424988499670882903331924456595174440596486667376809401657837605352443993328765346888317298773587289341833264731334053459721427501823841086498332906930530733191713505651751482475205249629382168928445906862553353809790024004765609374170991200927768372793203466526753684184733546819496462571308587000005542510177796799466658351655432870737145980825280675385629526127427749330360128919896095180220153731152547232902414449300057881663290139046679303043369645637759363447276854004266725708650533515659841014439550163969551211684973125432390224890525962642109877024931369092909746097760663270796326778257248129159468561608222519436144520994743369772013673133723442587382331825572378763182630106343274712813977244127852334689458980479848468119356818416947742342141123493434950");        
			huge2 = new BigInteger("4802005815844740048020669135945255478726054448800971541474491529526544036676045271013078353837668820667031753166721890440909755158059046411714360725726986917827645524006725896333487996733082127513769136011849707334431803957022347296514251288130257855299458504804954983643270304727772995865276519199049415396491556692767280935853647075811800931197569703219458675712752685412578438425642989007279200073236077325677012859126233496942705174703418001641581178207213891304623376872942170428962888730517045554314086776981287132076385680524289310277798763376705908950496120848893716695076266092319429667475502761477953858867468336474757436977729516749084279606644591849821398288421247984675295952943268583684079773469440764229566393744239995779935242643390450689561204521461422691599162543561746597373713167996360765540953888287748287236671327847128432619319151230932966917339405198632944738624142159297440577473633173286190002372727335846605136478416440432370587372077605712712067366467826125921271222375181276012168567524570186166913594525547872605444880097154147449152952654403667604527101307835383766882066703175316672189044090975515805904641171436072572698691782764552400672589633348799673308212751376913601184970733443180395702234729651425128813025785529945850480495498364327030472777299586527651919904941539649155669276728093585364707581180093119756970321945867571275268541257843842564298900727920007323607732567701285912623349694270517470341800164158117820721389130462337687294217042896288873051704555431408677698128713207638568052428931027779876337670590895049612084889371669507626609231942966747550276147795385886746833647475743697772951674908427960664459184982139828842124798467529595294326858368407977346944076422956639374423999577993524264339045068956120452146142269159916254356174659737371316799636076554095388828774828723667132784712843261931915123093296691733940519863294473862414215929744057747363317328619000237272733584660513647841644043237058737207760571271206736646782612592127122237518127601216856752457018616691359452554787260544488009715414744915295265440366760452710130783538376688206670317531667218904409097551580590464117143607257269869178276455240067258963334879967330821275137691360118497073344318039570223472965142512881302578552994585048049549836432703047277729958652765191990494153964915566927672809358536470758118009311975697032194586757127526854125784384256429890072792000732360773256770128591262334969427051747034180016415811782072138913046233768729421704289628887305170455543140867769812871320763856805242893102777987633767059089504961208488937166950762660923194296674755027614779538588674683364747574369777295167490842796066445918498213982884212479846752959529432685836840797734694407642295663937442399957799352426433904506895612045214614226915991625435617465973737131679963607655409538882877482872366713278471284326193191512309329669173394051986329447386241421592974405774736331732861900023727273358466051364784164404323705873720776057127120673664678261259212712223751812760121685675245701861669135945255478726054448800971541474491529526544036676045271013078353837668820667031753166721890440909755158059046411714360725726986917827645524006725896333487996733082127513769136011849707334431803957022347296514251288130257855299458504804954983643270304727772995865276519199049415396491556692767280935853647075811800931197569703219458675712752685412578438425642989007279200073236077325677012859126233496942705174703418001641581178207213891304623376872942170428962888730517045554314086776981287132076385680524289310277798763376705908950496120848893716695076266092319429667475502761477953858867468336474757436977729516749084279606644591849821398288421247984675295952943268583684079773469440764229566393744239995779935242643390450689561204521461422691599162543561746597373713167996360765540953888287748287236671327847128432619319151230932966917339405198632944738624142159297440577473633173286190002372727335846605136478416440432370587372077605712712067366467826125921271222375181276012168567524570186166913594525547872605444880097154147449152952654403667604527101307835383766882066703175316672189044090975515805904641171436072572698691782764552400672589633348799673308212751376913601184970733443180395702234729651425128813025785529945850480495498364327030472777299586527651919904941539649155669276728093585364707581180093119756970321945867571275268541257843842564298900727920007323607732567701285912623349694270517470341800164158117820721389130462337687294217042896288873051704555431408677698128713207638568052428931027779876337670590895049612084889371669507626609231942966747550276147795385886746833647475743697772951674908427960664459184982139828842124798467529595294326858368407977346944076422956639374423999577993524264339045068956120452146142269159916254356174659737371316799636076554095388828774828723667132784712843261931915123093296691733940519863294473862414215929744057747363317328619000237272733584660513647841644043237058737207760571271206736646782612592127122237518127601216856752457018610581584474007942996246115408215557668609193177406997571115085848702084504173185796302959451592548558882552304385165495606591464218589054119760119647765337229689677378971180690232950260649956123854798575279679531097498050726737042498849967088290333192445659517444059648666737680940165783760535244399332876534688831729877358728934183326473133405345972142750182384108649833290693053073319171350565175148247520524962938216892844590686255335380979002400476560937417099120092776837279320346652675368418473354681949646257130858700000554251017779679946665835165543287073714598082528067538562952612742774933036012891989609518022015373115254723290241444930005788166329013904667930304336964563775936344727685400426672570865053351565984101443955016396955121168497312543239022489052596264210987702493136909290974609776066327079632677825724812915946856160822251943614452099474336977201367313372344258738233182557237876318263010634327471281397724412785233468945898047984846811935681841694774234214112349343495048020058158447400794299624611540821555766860919317740699757111508584870208450417318579630295945159254855888255230438516549560659146421858905411976011964776533722968967737897118069023295026064995612385479857527967953109749805072673704249884996708829033319244565951744405964866673768094016578376053524439933287653468883172987735872893418332647313340534597214275018238410864983329069305307331917135056517514824752052496293821689284459068625533538097900240047656093741709912009277683727932034665267536841847335468194964625713085870000055425101777967994666583516554328707371459808252806753856295261274277493303601289198960951802201537311525472329024144493000578816632901390466793030433696456377593634472768540042667257086505335156598410144395501639695512116849731254323902248905259626421098770249313690929097460977606632707963267782572481291594685616082225194361445209947433697720136731337234425873823318255723787631826301063432747128139772441278523346894589804798484681193568184169477423421411234934349504802005815844740079429962461154082155576686091931774069975711150858487020845041731857963029594515925485588825523043851654956065914642185890541197601196477653372296896773789711806902329502606499561238547985752796795310974980507267370424988499670882903331924456595174440596486667376809401657837605352443993328765346888317298773587289341833264731334053459721427501823841086498332906930530733191713505651751482475205249629382168928445906862553353809790024004765609374170991200927768372793203466526753684184733546819496462571308587000005542510177796799466658351655432870737145980825280675385629526127427749330360128919896095180220153731152547232902414449300057881663290139046679303043369645637759363447276854004266725708650533515659841014439550163969551211684973125432390224890525962642109877024931369092909746097760663270796326778257248129159468561608222519436144520994743369772013673133723442587382331825572378763182630106343274712813977244127852334689458980479848468119356818416947742342141123493434950480200581584474007942996246115408215557668609193177406997571115085848702084504173185796302959451592548558882552304385165495606591464218589054119760119647765337229689677378971180690232950260649956123854798575279679531097498050726737042498849967088290333192445659517444059648666737680940165783760535244399332876534688831729877358728934183326473133405345972142750182384108649833290693053073319171350565175148247520524962938216892844590686255335380979002400476560937417099120092776837279320346652675368418473354681949646257130858700000554251017779679946665835165543287073714598082528067538562952612742774933036012891989609518022015373115254723290241444930005788166329013904667930304336964563775936344727685400426672570865053351565984101443955016396955121168497312543239022489052596264210987702493136909290974609776066327079632677825724812915946856160822251943614452099474336977201367313372344258738233182557237876318263010634327471281397724412785233468945898047984846811935681841694774234214112349343495079429962461154082155576686091931774069975711150858487020845041731857963029594515925485588825523043851654956065914642185890541197601196477653372296896773789711806902329502606499561238547985752796795310974980507267370424988499670882903331924456595174440596486667376809401657837605352443993328765346888317298773587289341833264731334053459721427501823841086498332906930530733191713505651751482475205249629382168928445906862553353809790024004765609374170991200927768372793203466526753684184733546819496462571308587000005542510177796799466658351655432870737145980825280675385629526127427749330360128919896095180220153731152547232902414449300057881663290139046679303043369645637759363447276854004266725708650533515659841014439550163969551211684973125432390224890525962642109877024931369092909746097760663270796326778257248129159468561608222519436144520994743369772013673133723442587382331825572378763182630106343274712813977244127852334689458980479848468119356818416947742342141123493434950");        
			       
			startTime = System.currentTimeMillis();
			for(int numRun=0; numRun < MAXRUN; numRun++) {
				huge3 = huge2.add(huge1);
			}
			endTime = System.currentTimeMillis();
			runTime +=(double) (endTime - startTime)/((double) MAXRUN);
				}
		runTime = runTime/((double)MAXNUMINTS);
		System.out.println("100 - " + runTime);
		
		
		
	}


	}
	
	
