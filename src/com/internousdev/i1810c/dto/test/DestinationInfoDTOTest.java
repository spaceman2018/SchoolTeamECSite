package com.internousdev.i1810c.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.i1810c.dto.DestinationInfoDTO;

public class DestinationInfoDTOTest {

	//getId test
	@Test
	public void testGetIdNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetIdNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetIdNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetIdNo4() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetIdNo5() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//setId test
	@Test
	public void testSetIdNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdNo4() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetIdNo5() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//getUserID test
	@Test
	public void testGetUserIdNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserIdNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//setUserId test
	@Test
	public void testSetUserIdNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abcあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserIdNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//getFamilyName test
	@Test
	public void testGetFamilyNameNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	//setFamilyName test
	@Test
	public void testSetFamilyNameNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	//getFirstName test
	@Test
	public void testGetFirstNameNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	//setFirstName test
	@Test
	public void testSetFirstNameNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	//getFamilyNameKana test
	@Test
	public void testGetFamilyNameKanaNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKanaNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	//setFamilyNameKana test
	@Test
	public void testSetFamilyNameKanaNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanaNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	//getFirstNameKana test
	@Test
	public void testGetFirstNameKanaNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKanaNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	//setFirstNameKana test
	@Test
	public void testSetFirstNameKanaNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKanaNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	//getUserAddress test
	@Test
	public void testGetUserAddressNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "0";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "-2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddressNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	//setUserAddress test
	@Test
	public void testSetUserAddressNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "0";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "-2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddressNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	//getTelnumber test
	@Test
	public void testGetTelNumberNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "0";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "-2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumberNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	//setTelNumber test
	@Test
	public void testSetTelNumberNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "0";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "-2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumberNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	//getEmail test
	@Test
	public void testGetEmailNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmailNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//setEmail test
	@Test
	public void testSetEmailNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmailNo12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//getRegistDate test
	@Test
	public void testGetRegistDateNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDateNo2() throws ParseException {
		DestinationInfoDTO dto = new DestinationInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	//setRegistDate test
	@Test
	public void testSetRegistDateNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDateNo2() throws ParseException {
		DestinationInfoDTO dto = new DestinationInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	//getUpdateDate test
	@Test
	public void testGetUpdateDateNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDateNo2() throws ParseException{
		DestinationInfoDTO dto = new DestinationInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

	//setUpdateDate test
	@Test
	public void testSetUpdateDateNo1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDateNo2() throws ParseException{
		DestinationInfoDTO dto = new DestinationInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

}