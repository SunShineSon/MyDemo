package com.demo.lucene.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.LongField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

public class IndexFile {

	private static Logger log = Logger.getLogger(TxtFileIndexer.class);

	public static void main(String[] args) {
		IndexFile indexFile = new IndexFile();
		indexFile.createIndex();
	}

	public void createIndex() {
		IndexWriter writer = null;
		try {
			// Directory directory = new RAMDirectory(); 
			Directory directory = FSDirectory.open(Paths
					.get("F:/learn/lucene/luceneDir"));
			Analyzer analyzer = new StandardAnalyzer();
			IndexWriterConfig indexWriterConfig = new IndexWriterConfig(
					analyzer);
			writer = new IndexWriter(directory, indexWriterConfig);
			Document document = null;
			File files = new File("F:/learn/lucene/luceneData");
			for (File file : files.listFiles()) {
				log.info("filename:" + file.getName());
				document = new Document();
				document.add(new LongField("modified", files.lastModified(),
						Field.Store.NO));
				document.add(new TextField("contents", new FileReader(file)));
				document.add(new StringField("path", file.toString(),
						Field.Store.YES));
				writer.addDocument(document);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void query() {
		IndexWriter writer = null;
		try {
			Directory directory = FSDirectory.open(Paths
					.get("F:/learn/lucene/luceneDir"));
			Analyzer analyzer = new StandardAnalyzer();
			IndexWriterConfig indexWriterConfig = new IndexWriterConfig(
					analyzer);
			writer = new IndexWriter(directory, indexWriterConfig);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
