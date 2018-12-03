package com.internousdev.i1810c.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.i1810c.dto.PurchaseHistoryInfoDTO;

public class PurchaseHistoryInfoDTOTest {

	int imaX = 2147483647;
	int imiN = -2147483648;
	String max = "2147483648";
	String min = "-2147483649";
	String ermax = "For input string: \"2147483648\"";
	String ermin = "For input string: \"-2147483649\"";

	String space = "　";
	String abc123 = "abc123";
	String aiu123 = "あいう１２３";
	String abc123Aiu123 = "abc123あいう１２３";
	String abc123AiuKanji = "ａｂｃ１２３あいう漢字";

	//id

	@Test
	public void testGetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setId(ex);

		int act = dto.getId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setId(ex);

		int act = dto.getId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setId(ex);

		int act = dto.getId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setId(ex);

		int act = dto.getId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setId(ex);

		int act = dto.getId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setId(ex);

		int act = dto.getId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setId(ex);

			int act = dto.getId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testSetId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setId(ex);

			int act = dto.getId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testGetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setId(ex);

			int act = dto.getId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testSetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setId(ex);

			int act = dto.getId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}

	}

	//subTotal

	@Test
	public void testGetSubtotal1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setSubtotal(ex);

		int act = dto.getId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetSubtotal1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setSubtotal(ex);

		int act = dto.getSubtotal();
		assertEquals(ex,act);
	}

	public void testGetSubtotal2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setSubtotal(ex);

		int act = dto.getSubtotal();
		assertEquals(ex,act);
	}

	@Test
	public void testSetSubtotal2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setSubtotal(ex);

		int act = dto.getSubtotal();
		assertEquals(ex,act);
	}

	public void testGetSubtotal3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setSubtotal(ex);

		int act = dto.getSubtotal();
		assertEquals(ex,act);
	}

	@Test
	public void testSetSubtotal3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setSubtotal(ex);

		int act = dto.getSubtotal();
		assertEquals(ex,act);
	}

	public void testGetSubtotal4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setSubtotal(ex);

			int act = dto.getSubtotal();
			assertEquals(ex,act);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testSetSubtotal4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setSubtotal(ex);

			int act = dto.getSubtotal();
			assertEquals(ex,act);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	public void testGetSubtotal5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setSubtotal(ex);

			int act = dto.getSubtotal();
			assertEquals(ex,act);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testSetSubtotal5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setSubtotal(ex);

			int act = dto.getSubtotal();
			assertEquals(ex,act);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	//userId

	@Test
	public void testGetUserId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserId6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserId7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserId8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserId8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setUserId(ex);

		String act = dto.getUserId();
		assertEquals(ex,act);
	}

	//productId

	@Test
	public void testGetProductId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setProductId(ex);

		int act = dto.getProductId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setProductId(ex);

		int act = dto.getProductId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setProductId(ex);

		int act = dto.getProductId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setProductId(ex);

		int act = dto.getProductId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setProductId(ex);

		int act = dto.getProductId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setProductId(ex);

		int act = dto.getProductId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setProductId(ex);

			int act = dto.getProductId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testSetProductId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setProductId(ex);

			int act = dto.getProductId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testGetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setProductId(ex);

			int act = dto.getProductId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testSetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setProductId(ex);

			int act = dto.getProductId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testGetProductCount1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setProductCount(ex);

		int act = dto.getProductCount();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductCount1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setProductCount(ex);

		int act = dto.getProductCount();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductCount2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setProductCount(ex);

		int act = dto.getProductCount();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductCount2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setProductCount(ex);

		int act = dto.getProductCount();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductCount3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setProductCount(ex);

		int act = dto.getProductCount();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductCount3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setProductCount(ex);

		int act = dto.getProductCount();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductCount4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setProductCount(ex);

			int act = dto.getProductCount();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testSetProductCount4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setProductCount(ex);

			int act = dto.getProductCount();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testGetProductCount5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setProductCount(ex);

			int act = dto.getProductCount();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testSetProductCount5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setProductCount(ex);

			int act = dto.getProductCount();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	//price

	@Test
	public void testGetPrice1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setPrice(ex);

		int act = dto.getPrice();
		assertEquals(ex,act);
	}

	@Test
	public void testSetPrice1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setPrice(ex);

		int act = dto.getPrice();
		assertEquals(ex,act);
	}

	@Test
	public void testGetPrice2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setPrice(ex);

		int act = dto.getPrice();
		assertEquals(ex,act);
	}

	@Test
	public void testSetPrice2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setPrice(ex);

		int act = dto.getPrice();
		assertEquals(ex,act);
	}

	@Test
	public void testGetPrice3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setPrice(ex);

		int act = dto.getPrice();
		assertEquals(ex,act);
	}

	@Test
	public void testSetPrice3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setPrice(ex);

		int act = dto.getPrice();
		assertEquals(ex,act);
	}

	@Test
	public void testGetPrice4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setPrice(ex);

			int act = dto.getPrice();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testSetPrice4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setPrice(ex);

			int act = dto.getPrice();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testGetPrice5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setPrice(ex);

			int act = dto.getPrice();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testSetPrice5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setPrice(ex);

			int act = dto.getPrice();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	//destinationId

	@Test
	public void testGetDestinationId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setDestinationId(ex);

		int act = dto.getDestinationId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetDestinationId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setDestinationId(ex);

		int act = dto.getDestinationId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetDestinationId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setDestinationId(ex);

		int act = dto.getDestinationId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetDestinationId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setDestinationId(ex);

		int act = dto.getDestinationId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetDestinationId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setDestinationId(ex);

		int act = dto.getDestinationId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetDestinationId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setDestinationId(ex);

		int act = dto.getDestinationId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetDestinationId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setDestinationId(ex);

			int act = dto.getDestinationId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testSetDestinationId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setDestinationId(ex);

			int act = dto.getDestinationId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testGetDestinationId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setDestinationId(ex);

			int act = dto.getDestinationId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testSetDestinationId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setDestinationId(ex);

			int act = dto.getDestinationId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	//registDate

	@Test
	public void testGetRegistDate1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date ex = null;
		dto.setRegistDate(ex);

		Date act = dto.getRegistDate();
		assertEquals(ex,act);

	}

	@Test
	public void testSetRegistDate1(){
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date ex = null;
		dto.setRegistDate(ex);

		Date act = dto.getRegistDate();
		assertEquals(ex,act);
	}

	@Test
	public void testGetRegistDate2() throws ParseException {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date ex = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(ex);

		Date act = dto.getRegistDate();
		assertEquals(ex,act);
	}

	@Test
	public void testSetRegistDate2() throws ParseException {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date ex = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(ex);

		Date act = dto.getRegistDate();
		assertEquals(ex,act);
	}

	//updateDate

	@Test
	public void testGetUpdateDate1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date ex = null;
		dto.setUpdateDate(ex);

		Date act = dto.getUpdateDate();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUpdateDate1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date ex = null;
		dto.setUpdateDate(ex);

		Date act = dto.getUpdateDate();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUpdateDate2() throws ParseException {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date ex = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(ex);

		Date act = dto.getUpdateDate();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUpdateDate2() throws ParseException {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date ex = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(ex);

		Date act = dto.getUpdateDate();
		assertEquals(ex,act);
	}

	//productName

	@Test
	public void testGetProductName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setProductName(ex);

		String act = dto.getProductName();
		assertEquals(ex,act);
	}

	//productNameKana

	@Test
	public void testGetProductNameKana1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductNameKana2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductNameKana3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductNameKana4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductNameKana5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductNameKana6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductNameKana7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductNameKana8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductNameKana8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setProductNameKana(ex);

		String act = dto.getProductNameKana();
		assertEquals(ex,act);
	}

	//productDescription

	@Test
	public void testGetProductDescription1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductDescription2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductDescription3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductDescription4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductDescription5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductDescription6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductDescription7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testGetProductDescription8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	@Test
	public void testSetProductDescription8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setProductDescription(ex);

		String act = dto.getProductDescription();
		assertEquals(ex,act);
	}

	//categoryId

	@Test
	public void testGetCategoryId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setCategoryId(ex);

		int act = dto.getCategoryId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetCategoryId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = 0;
		dto.setCategoryId(ex);

		int act = dto.getCategoryId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetCategoryId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setCategoryId(ex);

		int act = dto.getCategoryId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetCategoryId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imaX;
		dto.setCategoryId(ex);

		int act = dto.getCategoryId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetCategoryId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setCategoryId(ex);

		int act = dto.getCategoryId();
		assertEquals(ex,act);
	}

	@Test
	public void testSetCategoryId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int ex = imiN;
		dto.setCategoryId(ex);

		int act = dto.getCategoryId();
		assertEquals(ex,act);
	}

	@Test
	public void testGetCategoryId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setCategoryId(ex);

			int act = dto.getCategoryId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testSetCategoryId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(max);
			dto.setCategoryId(ex);

			int act = dto.getCategoryId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermax);
		}
	}

	@Test
	public void testGetCategoryId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setCategoryId(ex);

			int act = dto.getCategoryId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	@Test
	public void testSetCategoryId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int ex = Integer.parseInt(min);
			dto.setCategoryId(ex);

			int act = dto.getCategoryId();
			assertEquals(ex,act);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),ermin);
		}
	}

	//imageFilePath

	@Test
	public void testGetImageFilePath1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFilePath2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFilePath3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFilePath4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFilePath5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFilePath6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFilePath7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFilePath8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFilePath8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setImageFilePath(ex);

		String act = dto.getImageFilePath();
		assertEquals(ex,act);
	}

	//imageFleName

	@Test
	public void testGetImageFileName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFileName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFileName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFileName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFileName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFileName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFileName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetImageFileName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetImageFileName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setImageFileName(ex);

		String act = dto.getImageFileName();
		assertEquals(ex,act);
	}

	//releaseCompany

	@Test
	public void testGetReleaseCompany1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseCompany2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseCompany3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseCompany4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseCompany5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseCompany6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseCompany7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseCompany8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseCompany8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setReleaseCompany(ex);

		String act = dto.getReleaseCompany();
		assertEquals(ex,act);
	}

	//releaseDate

	@Test
	public void testGetReleaseDate1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date ex = null;
		dto.setReleaseDate(ex);

		Date act = dto.getReleaseDate();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseDate1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date ex = null;
		dto.setReleaseDate(ex);

		Date act = dto.getReleaseDate();
		assertEquals(ex,act);
	}

	@Test
	public void testGetReleaseDate2() throws ParseException {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date ex = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(ex);

		Date act = dto.getReleaseDate();
		assertEquals(ex,act);
	}

	@Test
	public void testSetReleaseDate2() throws ParseException {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date ex = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(ex);

		Date act = dto.getReleaseDate();
		assertEquals(ex,act);
	}

	//familyName

	@Test
	public void testGetFamilyName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFamilyName(ex);

		String act = dto.getFamilyName();
		assertEquals(ex,act);
	}

	//firstName

	@Test
	public void testGetFirstName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFirstName(ex);

		String act = dto.getFirstName();
		assertEquals(ex,act);
	}

	//familyNameKana

	@Test
	public void testGetFamilyNameKana1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyNameKana2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyNameKana3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyNameKana4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyNameKana5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyNameKana6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyNameKana7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFamilyNameKana8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFamilyNameKana8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFamilyNameKana(ex);

		String act = dto.getFamilyNameKana();
		assertEquals(ex,act);
	}

	//firstNameKana

	@Test
	public void testGetFirstNameKana1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstNameKana2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstNameKana3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstNameKana4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstNameKana5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstNameKana6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstNameKana7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testGetFirstNameKana8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	@Test
	public void testSetFirstNameKana8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setFirstNameKana(ex);

		String act = dto.getFirstNameKana();
		assertEquals(ex,act);
	}

	//email

	@Test
	public void testGetEmail1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testGetEmail2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testGetEmail3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testGetEmail4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testGetEmail5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testGetEmail6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testGetEmail7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testGetEmail8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	@Test
	public void testSetEmail8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setEmail(ex);

		String act = dto.getEmail();
		assertEquals(ex,act);
	}

	//telNumber

	@Test
	public void testGetTelNumber1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testGetTelNumber2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testGetTelNumber3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testGetTelNumber4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testGetTelNumber5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testGetTelNumber6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testGetTelNumber7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testGetTelNumber8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	@Test
	public void testSetTelNumber8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setTelNumber(ex);

		String act = dto.getTelNumber();
		assertEquals(ex,act);
	}

	//userAddress

	@Test
	public void testGetUserAddress1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = null;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserAddress2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = "";
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserAddress3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = " ";
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserAddress4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = space;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserAddress5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserAddress6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = aiu123;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserAddress7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123Aiu123;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testGetUserAddress8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

	@Test
	public void testSetUserAddress8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String ex = abc123AiuKanji;
		dto.setUserAddress(ex);

		String act = dto.getUserAddress();
		assertEquals(ex,act);
	}

}
