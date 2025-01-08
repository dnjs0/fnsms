package com.fnsms.view;

public class InstructorMemberView {
	
	static String id = "아무개"; //아무개로 로그인 함
	static String position = "PT"; //아무개 회원의 직책
	static int total_mem = 100; //전체 회원수 임시 데이터 
	static int manage_mem = 9; //아무개의 담당 회원수 임시 데이터
	
	//3-3 회원 관리 페이지
	public static void memberManagement() {
		Header logo = new Header();
		logo.Logo();
		System.out.println("\t\t\t\t\t\t\t       강사 메인페이지/회원 관리");
		System.out.println("=================================================================================");
		System.out.printf("\t쌍용 헬스장의 회원수는 %d명입니다.\n",total_mem);
		System.out.printf("\t%s %s님의 담당 회원수는 %d명입니다.\n",id,position,manage_mem);
		System.out.println("=================================================================================");
		System.out.println();
		System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
		System.out.println("\t1. 회원 신규 등록");
		System.out.println("\t2. 회원 조회");
		System.out.println();
//		System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		
		
	}
	
	//3-3-1 회원 신규 등록
	public static void newMemRegistration() {
		Header logo = new Header();
		logo.Logo();
		System.out.println("\t\t\t\t\t\t    강사 메인페이지/회원 관리/회원 신규 등록");
		System.out.println("=================================================================================");
		System.out.println("\t회원 신규 등록을 위한 회원 이름, 전화번호, 생년월일, 성별을 입력해주세요.");
		System.out.println("=================================================================================");
		System.out.println();
		System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//		System.out.println("\t회원 이름 : ");
//		System.out.println("\t전화번호 : ");
//		System.out.println("\t생년월일 : ");
//		System.out.println("\t성별 : ");
		
	}
	
	
	//3-3-2 회원 조회
	public static void searchMember() {
		Header logo = new Header();
		logo.Logo();
		System.out.println("\t\t\t\t\t\t\t강사 메인페이지/회원 관리/회원 조회");
		System.out.println("=================================================================================");
		System.out.println("\t회원 조회를 위해 회원 이름을 입력해주세요.");
		System.out.println("=================================================================================");
		System.out.println();
		System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//		System.out.println("\t회원 이름 :  ");
	}
	
	
	//3-3-2-0 회원 조회 실패할 경우
		public static void searchMemberFailed() {
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t\t\t\t강사 메인페이지/회원 관리/회원 조회");
			System.out.println("=================================================================================");
			System.out.println("\t※ 입력한 이름은 없는 회원입니다! 회원 이름을 다시 입력해주세요.");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//			System.out.println("\t회원 이름 : ");
		}
		
		//동명이인중 조회할 회원 하나를 선택
		public static void selectMemberList() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t\t\t\t강사 메인페이지/회원 관리/회원 조회");
			System.out.println("=================================================================================");
			System.out.printf("\t검색한 %s 회원님 명단입니다.\n",member);
			System.out.printf("\t[번호]\t[이름]\t[담당자]\t[전화번호]\t\t[생년월일]\t\t[성별]\n");
			System.out.printf("\t%4d\t%3s\t%4s\t%s\t%s\t%3s\n",001,"홍길동","아무개","010-2345-4456","00-01-23","여성");
			System.out.printf("\t%4d\t%3s\t%4s\t%s\t%s\t%3s\n",002,"홍길동","관리자","010-2335-4706","80-07-28","여성");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//			System.out.println("\t조회할 회원님의 전화번호 뒤 4자리를 입력하세요 : ");
			
		
		}
		
		//동명이인중 조회할 회원 선택 실패
			public static void selectMemberListFailed() {
				String member = "홍길동"; //홍길동을 입력 받았을때
				Header logo = new Header();
				logo.Logo();
				System.out.println("\t\t\t\t\t\t\t강사 메인페이지/회원 관리/회원 조회");
				System.out.println("=================================================================================");
				System.out.printf("\t검색한 %s 회원님 명단입니다.\n",member);
				System.out.printf("\t[번호]\t[이름]\t[담당자]\t[전화번호]\t\t[생년월일]\t\t[성별]\n");
				System.out.printf("\t%4d\t%3s\t%4s\t%s\t%s\t%3s\n",001,"홍길동","아무개","010-2345-4456","00-01-23","여성");
				System.out.printf("\t%4d\t%3s\t%4s\t%s\t%s\t%3s\n",002,"홍길동","관리자","010-2335-4706","80-07-28","남성");
				System.out.println("=================================================================================");
				System.out.println();
				System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
				System.out.println("\t※ 조회할 회원이 없습니다!! 다시 정확하게 입력해주세요.");
//				System.out.println("\t조회할 회원님의 전화번호 뒤 4자리를 입력하세요 : ");
				}
		
		//3-3-2-2 0001 홍길동 선탣
		public static void selectMember() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t\t\t\t강사 메인페이지/회원 관리/회원 조회");
			System.out.println("=================================================================================");
			System.out.printf("\t이름 : %s\n",member);
			System.out.printf("\t연락처 : %s\n","010-3345-8977");
			System.out.printf("\t성별 : %s\n","여성");
			System.out.printf("\t생년월일 : %s\n","00-11-23");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
			System.out.println("\t1. 회원 정보 수정");
			System.out.println("\t2. 이용권 신규 등록");
			System.out.println("\t3. 이용권 수정");
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		}

		
		public static void editMember() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t\t    강사 메인페이지/회원 관리/회원 조회/회원 정보 수정");
			System.out.println("=================================================================================");
			System.out.printf("\t이름 : %s\n",member);
			System.out.printf("\t연락처 : %s\n","010-3345-8977");
			System.out.printf("\t성별 : %s\n","여성");
			System.out.printf("\t생년월일 : %s\n","00-11-23");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
			System.out.println("\t1. 이름 변경");
			System.out.println("\t2. 전화번호 변경");
			System.out.println("\t3. 성별 변경");
			System.out.println("\t4. 생년월일 변경");
			System.out.println("\t5. 회원삭제");
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		}
		
		public static void editMemberName() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t     강사 메인페이지/회원 관리/회원 조회/회원 정보 수정/이름 변경");
			System.out.println("=================================================================================");
			System.out.println("\t이름 :");
			System.out.printf("\t연락처 : %s\n","010-3345-8977");
			System.out.printf("\t성별 : %s\n","여성");
			System.out.printf("\t생년월일 : %s\n","00-11-23");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//			System.out.println("\t이름 재입력 : (위의 이름 칸이 널값이 됩니다.)");
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		}
		
		public static void editMemberTel() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t   강사 메인페이지/회원 관리/회원 조회/회원 정보 수정/전화번호 변경");
			System.out.println("=================================================================================");
			System.out.printf("\t이름 : %s\n",member);
			System.out.printf("\t연락처 : %s\n","");
			System.out.printf("\t성별 : %s\n","여성");
			System.out.printf("\t생년월일 : %s\n","00-11-23");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//			System.out.println("\t연락처 재입력 : (위의 연락처 칸이 널값이 됩니다.)");
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		}

		
		public static void editMemberGender() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t     강사 메인페이지/회원 관리/회원 조회/회원 정보 수정/성별 변경");
			System.out.println("=================================================================================");
			System.out.printf("\t이름 : %s\n",member);
			System.out.printf("\t연락처 : %s\n","010-3345-8977");
			System.out.printf("\t성별 : %s\n","");
			System.out.printf("\t생년월일 : %s\n","00-11-23");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//			System.out.println("\t성별 재입력 : (위의 성별 칸이 널값이 됩니다.)");
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		}

		
		public static void editMemberBirth() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t   강사 메인페이지/회원 관리/회원 조회/회원 정보 수정/생년월일 변경");
			System.out.println("=================================================================================");
			System.out.printf("\t이름 : %s\n",member);
			System.out.printf("\t연락처 : %s\n","010-3345-8977");
			System.out.printf("\t성별 : %s\n","여성");
			System.out.printf("\t생년월일 : %s\n","");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//			System.out.println("\t생년월일(YY-MM-DD) 재입력 : (위의 생년월일 칸이 널값이 됩니다.)");
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		}

		
		//회원을 삭제할 경우 (이용권을 양도할때 등)
		public static void deleteMember() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t     강사 메인페이지/회원 관리/회원 조회/회원 정보 수정/회원 삭제");
			System.out.println("=================================================================================");
			System.out.printf("\t이름 : %s\n",member);
			System.out.printf("\t연락처 : %s\n","010-3345-8977");
			System.out.printf("\t성별 : %s\n","여성");
			System.out.printf("\t생년월일 : %s\n","00-11-23");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
			System.out.println("\t정말 홍길동 회원님의 정보를 삭제하시겠습니까? (y/n)"); 
			//n 누르면 "홍길동 회원님의 정보가 삭제되지 않았습니다. 메인화면으로 이동합니다."를 출력하고
			//#과 같이 메인으로 돌아감
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");
		}
		
		
		//3-3-2-2-1 이용권 신규 등록
		public static void registerSubscription() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t\t   강사 메인페이지/회원 관리/회원 조회/이용권 신규 등록");
			System.out.println("=================================================================================");
			System.out.println("\t"+ member + "님의 이용권 신규 등록을 위해 ");
			System.out.println("\t등록일, 이용권 구분, 담당자, 이용 기간, 시작일, 금액을 입력하세요.");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
//			System.out.print("\t등록일(YYYY-MM-DD) : "); 
//			System.out.print("\t이용권 구분 : "); 
//			System.out.print("\t담당자 : "); 
//			System.out.print("\t이용 기간(일) : "); 
//			System.out.print("\t시작일(YYYY-MM-DD) : "); 
//			System.out.print("\t종료일(YYYY-MM-DD) : "); 종료일은 연산값(시작일+기간)으로 계산해서 조회할때 출력합니다
//			System.out.print("\t금액(원) : "); 
		}
		
		
		//3-3-2-2-1 이용권 수정
		public static void editSubscription() {
			String member = "홍길동"; //홍길동을 입력 받았을때
			
			Header logo = new Header();
			logo.Logo();
			System.out.println("\t\t\t\t\t       강사 메인페이지/회원 관리/회원 조회/이용권 수정");
			System.out.println("=================================================================================");
			System.out.println("\t"+ member + "님이 현재 이용중인 이용권 목록입니다.");
			System.out.println("\t1. 헬스 이용권 수정(시작일-종료일)");
			System.out.println("\t2. Pt 이용권 수정(시작일-종료일)");
			System.out.println("=================================================================================");
			System.out.println();
			System.out.println("\t(메인으로 돌아가려면 '#'을 입력해주세요.)");
			System.out.println("\t수정을 원하는 이용권의 숫자를 적어주세요 : ");
			System.out.println();
//			System.out.print("\t🖙 원하는 작업을 입력해주세요 : ");

		}


}
