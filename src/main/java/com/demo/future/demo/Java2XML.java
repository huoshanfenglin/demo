package com.demo.future.demo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Java2XML {
	Book[] books = new Book[] { new Book("1", "唐诗三百首"), new Book("2", "Think in Java"), new Book("3", "神雕侠侣"),
			new Book("4", "葵花宝典") };

	public void BuildXMLDoc() throws IOException, JDOMException {
		// 创建根节点 并设置它的属性 ;
		Element root = new Element("books").setAttribute("count", "4");
		// 将根节点添加到文档中；
		Document Doc = new Document(root);

		for (int i = 0; i < books.length; i++) {
			// 创建节点 book;
			Element elements = new Element("book");
			// 给 book 节点添加子节点并赋值；
			elements.addContent(new Element("id").setText(books[i].getSn()));
			elements.addContent(new Element("name").setText(books[i].getNm()));
			//
			root.addContent(elements);
		}
		// 输出 books.xml 文件；
		// 使xml文件 缩进效果
		Format format = Format.getPrettyFormat();
		XMLOutputter XMLOut = new XMLOutputter(format);
		XMLOut.output(Doc, new FileOutputStream("c:/demo/books.xml"));
	}

	public static void main(String[] args) {
		try {
			Java2XML j2x = new Java2XML();
			System.out.println("正在生成 books.xml 文件...");
			j2x.BuildXMLDoc();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("c:/demo/books.xml 文件已生成");
	}

	class Book {
		private String sn;
		private String nm;

		public Book() {
			super();
		}

		public Book(String sn, String nm) {
			super();
			this.sn = sn;
			this.nm = nm;
		}

		public String getSn() {
			return sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}

		public String getNm() {
			return nm;
		}

		public void setNm(String nm) {
			this.nm = nm;
		}

	}
}
