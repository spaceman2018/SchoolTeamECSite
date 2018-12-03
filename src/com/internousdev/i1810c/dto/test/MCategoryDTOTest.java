package com.internousdev.i1810c.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.i1810c.dto.MCategoryDTO;

public class MCategoryDTOTest {

	//getId test
	@Test
	public void testGetIdNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetIdNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetIdNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetIdNo4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetIdNo5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
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
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdNo4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetIdNo5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//getCategoryId test
	@Test
	public void testGetCategoryIdNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryIdNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryIdNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryIdNo4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryIdNo5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//setCategoryId test
	@Test
	public void testSetCategoryIdNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCategoryIdNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCategoryIdNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCategoryIdNo4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryIdNo5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//getCategoryName test
	@Test
	public void testGetCategoryNameNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryNameNo12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	//setCategoryName test
	@Test
	public void testSetCategoryNameNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryNameNo12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	//getCategoryDescription test
	@Test
	public void testGetCategoryDescriptionNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescriptionNo12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	//setCategoryDescriprion test
	@Test
	public void testSetCategoryDescriptionNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescriptionNo12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	//getInsertDate test
	@Test
	public void testGetInsertDateNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetInsertDateNo2() throws ParseException {
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}

	//setInsertDate test
	@Test
	public void testSetInsertDateNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetInsertDateNo2() throws ParseException {
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}

	//getUpdateDate test
	@Test
	public void testGetUpdateDateNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDateNo2() throws ParseException {
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	//setUpdateDate test
	@Test
	public void testSetUpdateDateNo1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDateNo2() throws ParseException {
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

}